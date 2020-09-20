package com.example.allen.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    ArrayList<RowItem> myRowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRowItems = new ArrayList<RowItem>();
        myListView = (ListView) findViewById(R.id.flagListView);
        fillArrayList( ) ;

        CustomAdapter myAdapter = new CustomAdapter(getApplicationContext(), myRowItems);
        myListView.setAdapter( myAdapter );

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
              @Override
              public void onItemClick(AdapterView parent, View view, int position, long id) {

                  RowItem list_row = myRowItems.get(position);
                  Intent bigFlagIntent = new Intent( getApplicationContext( ), BigImage.class );
                  bigFlagIntent.putExtra( "IMAGE_NAME", list_row.getBigImageName() );
                  startActivity( bigFlagIntent );

              }
          }


        );

    }

    private void fillArrayList() {

        RowItem row_one = new RowItem( );
        row_one.setHeading("Flag of France");
        row_one.setSubHeading("France");
        row_one.setSmallImageName( R.drawable.small_france );
        row_one.setBigImageName( R.drawable.big_france );
        myRowItems.add( row_one );

        RowItem row_two = new RowItem( );
        row_two.setHeading("Flag of Germany");
        row_two.setSubHeading("Germany");
        row_two.setSmallImageName( R.drawable.small_germany );
        row_two.setBigImageName( R.drawable.big_germany );
        myRowItems.add( row_two );

        RowItem row_three = new RowItem( );
        row_three.setHeading("Flag of Italy");
        row_three.setSubHeading("Italy");
        row_three.setSmallImageName( R.drawable.small_italy );
        row_three.setBigImageName( R.drawable.big_italy );
        myRowItems.add( row_three );

        RowItem row_four = new RowItem( );
        row_four.setHeading("Flag of Italy");
        row_four.setSubHeading("Italy");
        row_four.setSmallImageName( R.drawable.small_romania );
        row_four.setBigImageName( R.drawable.big_romania );
        myRowItems.add( row_four );

        RowItem row_five = new RowItem( );
        row_five.setHeading("Flag of Italy");
        row_five.setSubHeading("Italy");
        row_five.setSmallImageName( R.drawable.small_sweden );
        row_five.setBigImageName( R.drawable.big_sweden );
        myRowItems.add( row_five );


    }
}
