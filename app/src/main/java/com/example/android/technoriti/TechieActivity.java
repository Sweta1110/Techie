package com.example.android.technoriti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewAnimator;


public class TechieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techie);

        final ViewAnimator viewAnimator = (ViewAnimator)this.findViewById(R.id.viewFlipper);



        viewAnimator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationFactory.flipTransition(viewAnimator, AnimationFactory.FlipDirection.LEFT_RIGHT);
            }

        });



        this.findViewById(R.id.view_parakram).setOnClickListener(new View.OnClickListener() {
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
