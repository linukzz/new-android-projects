package com.bear.coding.ex05_19;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View v) {

        MyDialogFragment frag = MyDialogFragment.newInstance();
        frag.show( getFragmentManager(), "TAG");
    }

    public static class MyDialogFragment extends DialogFragment {

        public static MyDialogFragment newInstance() {

             return new MyDialogFragment();
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            ProgressDialog dialog = new ProgressDialog(getActivity());
            dialog.setTitle("title");
            dialog.setMessage("message");
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

            return dialog;
        }
    }
}
