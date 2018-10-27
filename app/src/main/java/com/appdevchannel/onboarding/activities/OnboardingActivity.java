package com.appdevchannel.onboarding.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.appdevchannel.onboarding.MainActivity;
import com.appdevchannel.onboarding.fragment.OnboardingFragmentOne;
import com.appdevchannel.onboarding.fragment.OnboardingFragmentThree;
import com.appdevchannel.onboarding.fragment.OnboardingFragmentTwo;
import com.vlonjatg.android.apptourlibrary.AppTour;

public class OnboardingActivity extends AppTour {
    @Override
    public void init(@Nullable Bundle savedInstanceState) {
        int customSlideColor = Color.parseColor("#050200");
        addSlide(new OnboardingFragmentOne(), customSlideColor);
        addSlide(new OnboardingFragmentTwo(), customSlideColor);
        addSlide(new OnboardingFragmentThree(), customSlideColor);
        setSkipButtonTextColor(Color.WHITE);
        setNextButtonColorToWhite();
        setDoneButtonTextColor(Color.WHITE);
        setActiveDotColor(Color.parseColor("#FF5722"));
    }

    @Override
    public void onSkipPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDonePressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
