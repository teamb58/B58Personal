package com.B58works;

import android.annotation.SuppressLint;
import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.widget.Toast;

/**
 * Created by Bharath.R(58) on 16-11-2017.
 */

public class Activities extends Preference {

    @SuppressLint("NewApi")
    public Activities(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    protected void onClick() {
        super.onClick();
        final String key = this.getKey();
        switch (key) {
            case "reset": {
                this.getContext().getSharedPreferences("B58", 0).edit().clear().apply();
                Toast.makeText(this.getContext(), "@string/done", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
