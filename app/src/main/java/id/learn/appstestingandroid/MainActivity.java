package id.learn.appstestingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_var_a;
    private EditText et_var_b;
    private TextView et_result_calculate;

    private CalculateViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_var_a = findViewById(R.id.et_var_a);
        et_var_b = findViewById(R.id.et_var_b);
        et_result_calculate = findViewById(R.id.tv_result);
        Button btn_calculate = findViewById(R.id.btn_calculate);

        viewModel = new CalculateViewModel(new CalculateModel());

        btn_calculate.setOnClickListener(v -> {
            if (TextUtils.isEmpty(et_var_a.getText().toString().trim())) {
                et_var_a.setError("Can't Be Empty");
                et_var_a.requestFocus();
            } else if (TextUtils.isEmpty(et_var_b.getText().toString().trim())) {
                et_var_b.setError("Can't Be Empty");
                et_var_b.requestFocus();
            } else {
                int varA = Integer.parseInt(et_var_a.getText().toString().trim());
                int varB = Integer.parseInt(et_var_b.getText().toString().trim());

                viewModel.setVariable(varA, varB);

                et_result_calculate.setText("Result : " + viewModel.getResultCalculate());
            }
        });
    }
}