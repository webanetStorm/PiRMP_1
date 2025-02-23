package com.example.yaskevichmd;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class SideActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_side );

        Button button1 = (Button) findViewById( R.id.button2 );
        button1.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick( View view )
            {
                view.getContext().startActivity( new Intent( view.getContext(), MainActivity.class ) );
            }
        } );
    }

}
