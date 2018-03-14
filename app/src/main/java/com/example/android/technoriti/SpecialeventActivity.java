package com.example.android.technoriti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.widget.ViewAnimator;

/**
 * Created by Swedish_Sweta on 2/26/2018.
 */

public class SpecialeventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialevent);
        final ViewAnimator viewAnimator = (ViewAnimator)this.findViewById(R.id.viewFlipper);

        viewAnimator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator, AnimationFactory.FlipDirection.LEFT_RIGHT);
            }

        });

        // The following click listeners are not needed (only here to test that clicks
        // are routed to the correct subview of the view animator).

        this.findViewById(R.id.view_plantation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator, AnimationFactory.FlipDirection.LEFT_RIGHT);

            }

        });

        this.findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is all you need to do to 3D flip
                AnimationFactory.flipTransition(viewAnimator, AnimationFactory.FlipDirection.LEFT_RIGHT);
            }

        });

    }

}
