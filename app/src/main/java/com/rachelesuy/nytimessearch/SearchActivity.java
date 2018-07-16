package com.rachelesuy.nytimessearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {
EditText etQuery;
GridView gvResults;
Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_search);
        setupViews();
    }
    public void setupViews(){
        etQuery = (EditText) findViewById(R.id.etQuery);
        gvResults = (GridView) findViewById(R.id.gvResults);
        btnSearch = (Button) findViewById(R.id.btnSearch);
    }

    public void onArticleSearch(View view){
        String query = etQuery.getText().toString();
        //Toast.makeText(this,"searching for" +query, Toast.LENGTH_LONG).show();
       // As
    }
}

