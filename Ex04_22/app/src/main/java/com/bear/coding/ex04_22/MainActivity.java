package com.bear.coding.ex04_22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnContext = (Button) findViewById(R.id.Button1);
        btnContext.setOnLongClickListener(
                new View.OnLongClickListener() {

                    public boolean onLongClick(View view) {
                        if (mActionMode != null) {
                            return false;
                        }

                        mActionMode = startActionMode(mActionModeCallback);

                    view.setSelected(true);
                        return true;
                    }

                }
        );
    }//end onCreate

    private ActionMode.Callback mActionModeCallback= new ActionMode.Callback() {

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                MenuInflater Inflater = getMenuInflater();
                Inflater.inflate(R.menu.mymenu, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.item01:
                        Log.i("My Tag", "item01");
                        break;
                    case R.id.item02:
                        Log.i("My Tag", "item02");
                        break;
                    case R.id.item03:
                        Log.i("My Tag", "item03");
                        break;
                    case R.id.item04:
                        Log.i("My Tag", "item04");
                        break;
                    case R.id.item05:
                        Log.i("My Tag", "item05");
                        break;
                    case R.id.item06:
                        Log.i("My Tag", "item06");
                        break;
                }

                mode.finish();
                return true;
            }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;

        }

        };
    }

