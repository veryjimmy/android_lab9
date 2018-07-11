package com.example.veryjimmy.minesweeper1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ListAdapter;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] list = {"Start the Game","Help","About the Game"};
        ListAdapter badapter = new ArrayAdapter <String> (this, android.R.layout.simple_list_item_1,list);
        ListView b = (ListView)findViewById(R.id.a);
        b.setAdapter(badapter);

        b.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        Intent newActivity0 = new Intent(MainActivity.this,Minesweeper.class);
                        startActivity(newActivity0);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(MainActivity.this,Help.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(MainActivity.this,Explain.class);
                        startActivity(newActivity2);
                        break;

                    default:
                }
            }
        });

    }

}



