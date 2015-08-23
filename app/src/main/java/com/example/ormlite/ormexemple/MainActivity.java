package com.example.ormlite.ormexemple;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ormlite.ormexemple.BL.PessoaBL;
import com.example.ormlite.ormexemple.DAO.DatabaseManager;
import com.example.ormlite.ormexemple.DAO.PessoaDao;
import com.example.ormlite.ormexemple.Entity.Pessoa;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.ViewById;

@EActivity
public class MainActivity extends ActionBarActivity {

    @Bean
    public PessoaBL pessoaBL;
    @ViewById(R.id.txtNome)
    EditText txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseManager.init(this);
    }
    @Click(R.id.btnOk)
    public void ExecuteClick(){
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.Nome = txtNome.getText().toString();
            this.pessoaBL.pessoaDao.savePeople(pessoa);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.menuListagem) {
            Intent intent = new Intent(MainActivity.this, ListagemActivity.class);
            //intent.putExtra("key", value); //Optional parameters

            ListagemActivity_.intent(this).start();
        }


        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
