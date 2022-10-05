package com.example;

import androidx.appcompat.app.AppCompatActivity;
import com.example.domain.Employee;

import android.os.Bundle;
import android.widget.EditText;

public class EmployeeTest extends AppCompatActivity {
    EditText input_id;
    EditText name;
    EditText price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_id=(EditText) findViewById(R.id.input_id);
        name=(EditText) findViewById(R.id.name);
        price=(EditText) findViewById(R.id.price);
        Employee emp = new Employee();
        emp.setEmpId(76);
        emp.setName("Shawarma");
        emp.setSsn("1010");
        input_id.setText("Номер товара: "+emp.getEmpId());
        name.setText("Наименование товара: "+emp.getName());
        price.setText("Цена товара: "+emp.getSsn());
    }
}