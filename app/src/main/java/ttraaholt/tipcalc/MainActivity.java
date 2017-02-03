package ttraaholt.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBill = (EditText) findViewById(R.id.editTextAmount);
        etNumParty = (EditText) findViewById(R.id.EditTextPerPerson);
        tvTotalTip = (TextView) findViewById(R.id.txtBill);
        tvTipPerPerson = (TextView) findViewById(R.id.txtNumPeople);
    }

    public void onClickCalculate(View view) {

        Double num = Double.parseDouble(etBill.getText().toString());
        Double total = num * .10;
        tvTotalTip.setText("Total Tip: $" + total.toString() + " tip out of $" +etBill.getText());

        Double person = Double.parseDouble(etNumParty.getText().toString());
        Double party = total/person;
        tvTipPerPerson.setText("Total Tip Per Person: $" + party.toString());
    }
}
