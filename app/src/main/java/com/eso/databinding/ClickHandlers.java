package com.eso.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickHandlers {

    Context context;

    public ClickHandlers(Context context) {
        this.context = context;
    }

    public void onEnrollClickHandlers(View view){
        Toast.makeText(context, "Enroll Click", Toast.LENGTH_SHORT).show();
    }

    public void onCancelClickHandlers(View view){
        Toast.makeText(context, "Cancel Click", Toast.LENGTH_SHORT).show();
    }
}
