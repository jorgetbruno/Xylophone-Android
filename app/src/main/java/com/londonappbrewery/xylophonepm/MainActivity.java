package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;
    private final int SRC_QUALITY = 0;
    private final int SPOOL_PRIORITY = 1;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, SRC_QUALITY);

        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,SPOOL_PRIORITY);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,SPOOL_PRIORITY);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,SPOOL_PRIORITY);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,SPOOL_PRIORITY);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,SPOOL_PRIORITY);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,SPOOL_PRIORITY);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,SPOOL_PRIORITY);
        // TODO: Load and get the IDs to identify the sounds


    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View view) {
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playD(View view) {
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playE(View view) {
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playF(View view) {
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playG(View view) {
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playA(View view) {
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void playB(View view) {
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP,NORMAL_PLAY_RATE);
    }
}
