package com.B58works;

import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.util.List;

/**
 * Created by Bharath.R(58) on 18-11-2017.
 */

public class B58$4 extends B58$5{
    public static void a(final View view) throws IOException {
        try {
            a();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void collectStories(final List list, final String s) {
        B58$4.b.put(s, list);
    }

    public static void setCP(final int a) {
        B58$4.a = a;
    }

    public static void setVw(final View view) {
        if (view == null) {
            return;
        }
        try {
            ((ImageView)view.findViewById(B58.getID("div2", "id"))).setOnClickListener((View.OnClickListener)new B58$3());
        }
        catch (Exception ex) {}
    }

    public static void setplaying(final String c) {
        if (B58$4.c != null && (true ^ B58$4.c.equals(c))) {
            setCP(0);
        }
        B58$4.c = c;
    }
}
