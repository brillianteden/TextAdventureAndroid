package com.edenmugg.textadventure_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mTopButton;
    private Button mBottomButton;
    private TextView mStoryTextView;
    private int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            mStoryIndex = savedInstanceState.getInt("IndexKey");
        }
        else {
            mStoryIndex = 1;
        }

        mTopButton = (Button) findViewById(R.id.topButton);
        mBottomButton = (Button) findViewById(R.id.bottomButton);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mStoryTextView.setMovementMethod(new ScrollingMovementMethod());
        updateUI(R.string.T1_Story,R.string.T1_Ans1, R.string.T1_Ans2, 1);

        // TODO: Set a listener on the bottom button and write code to update mStoryTextView and the buttons when mTopButton is pressed:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 0:
                    case 23:
                    case 27:
                    case 37:
                    case 64:
                    case 85:
                    case 92:
                        updateUI(R.string.T1_Story,R.string.T1_Ans1, R.string.T1_Ans2, 1);
                        break;
                    case 1:
                        updateUI(R.string.T2_Story,R.string.T2_Ans1, R.string.T2_Ans2, 2);
                        mTopButton.setVisibility(View.VISIBLE);
                        mBottomButton.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        updateUI(R.string.T4_Story,R.string.T4_Ans1, R.string.T4_Ans2, 4);
                        break;
                    case 3:
                        updateUI(R.string.E6_Story,R.string.E6_Ans1, R.string.E6_Ans2, 6);
                        break;
                    case 4:
                    case 5:
                        updateUI(R.string.T8_Story,R.string.T8_Ans1, R.string.T8_Ans2, 8);
                        break;
                    case 6:
                        updateUI(R.string.E10_Story,R.string.E10_Ans1, R.string.E10_Ans2, 10);
                        break;
                    case 7:
                        updateUI(R.string.G12_Story,R.string.G12_Ans1, R.string.G12_Ans2, 12);
                        break;
                    case 8:
                        updateUI(R.string.T14_Story,R.string.T14_Ans1, R.string.T14_Ans2, 14);
                        break;
                    case 9:
                        updateUI(R.string.T20_Story,R.string.T20_Ans1, R.string.T20_Ans2, 20);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 10:
                    case 11:
                        updateUI(R.string.E16_Story,R.string.E16_Ans1, R.string.E16_Ans2, 16);
                        break;
                    case 12:
                    case 13:
                        updateUI(R.string.G18_Story,R.string.G18_Ans1, R.string.G18_Ans2, 18);
                        break;
                    case 14:
                    case 15:
                        updateUI(R.string.T26_Story,R.string.T26_Ans1, R.string.T26_Ans2, 26);
                        break;
                    case 16:
                        updateUI(R.string.E22_Story,R.string.E22_Ans1, R.string.E22_Ans2, 22);
                        break;
                    case 17:
                        updateUI(R.string.E28_Story,R.string.E28_Ans1, R.string.E28_Ans2, 28);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 18:
                        updateUI(R.string.G24_Story,R.string.G24_Ans1, R.string.G24_Ans2, 24);
                        break;
                    case 19:
                        updateUI(R.string.G30_Story,R.string.G30_Ans1, R.string.G30_Ans2, 30);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 22:
                        updateUI(R.string.E34_Story,R.string.E34_Ans1, R.string.E34_Ans2, 34);
                        break;
                    case 24:
                    case 25:
                        updateUI(R.string.G36_Story,R.string.G36_Ans1, R.string.G36_Ans2, 36);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 26:
                        updateUI(R.string.T33_Story,R.string.T33_Ans1, R.string.T33_Ans2, 33);
                        break;
                    case 32:
                        updateUI(R.string.T39_Story,R.string.T39_Ans1, R.string.T39_Ans2, 39);
                        break;
                    case 33:
                        updateUI(R.string.T45_Story,R.string.T45_Ans1, R.string.T45_Ans2, 45);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 34:
                        updateUI(R.string.E41_Story,R.string.E41_Ans1, R.string.E41_Ans2, 41);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 39:
                    case 44:
                        updateUI(R.string.T57_Story,R.string.T57_Ans1, R.string.T57_Ans2, 57);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 40:
                        updateUI(R.string.E52_Story,R.string.E52_Ans1, R.string.E52_Ans2, 52);
                        break;
                    case 52:
                    case 53:
                        updateUI(R.string.E70_Story,R.string.E70_Ans1, R.string.E70_Ans2, 70);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 54:
                        updateUI(R.string.G72_Story,R.string.G72_Ans1, R.string.G72_Ans2, 72);
                        break;
                    case 59:
                        updateUI(R.string.E64_Story,R.string.E64_Ans1, R.string.E64_Ans2, 64);
                        break;
                    case 62:
                        updateUI(R.string.T75_Story,R.string.T75_Ans1, R.string.T75_Ans2, 75);
                        break;
                    case 63:
                        updateUI(R.string.T92_Story,R.string.T92_Ans1, R.string.T92_Ans2, 92);
                        break;
                    case 72:
                    case 73:
                        updateUI(R.string.G79_Story,R.string.G79_Ans1, R.string.G79_Ans2, 79);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 78:
                        updateUI(R.string.G85_Story,R.string.G85_Ans1, R.string.G85_Ans2, 85);
                        break;
                    case 82:
                        updateUI(R.string.E83_Story,R.string.E83_Ans1, R.string.E83_Ans2, 83);
                        break;
                    case 99:
                        updateUI(R.string.T104_Story,R.string.T104_Ans1, R.string.T104_Ans2, 104);
                        break;
                    default:
                        updateUI(R.string.Temp_Story,R.string.Temp_Ans1, R.string.Temp_Ans2, 0);
                }
            }
        });



        // TODO: Set a listener on the bottom button and write code to update mStoryTextView and the buttons when mBottomButton is pressed:
            mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 0:
                    case 23:
                    case 27:
                    case 37:
                    case 64:
                    case 85:
                    case 92:
                        updateUI(R.string.End_Story,R.string.End_Ans1, R.string.End_Ans2, 1);
                        mTopButton.setVisibility(View.INVISIBLE);
                        mBottomButton.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        updateUI(R.string.T3_Story,R.string.T3_Ans1, R.string.T3_Ans2, 3);
                        mTopButton.setVisibility(View.VISIBLE);
                        mBottomButton.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        updateUI(R.string.T5_Story,R.string.T5_Ans1, R.string.T5_Ans2, 5);
                        break;
                    case 3:
                        updateUI(R.string.G7_Story,R.string.G7_Ans1, R.string.G7_Ans2, 7);
                        break;
                    case 4:
                    case 5:
                        updateUI(R.string.T9_Story,R.string.T9_Ans1, R.string.T9_Ans2, 9);
                        break;
                    case 6:
                        updateUI(R.string.E11_Story,R.string.E11_Ans1, R.string.E11_Ans2, 11);
                        break;
                    case 7:
                        updateUI(R.string.G13_Story,R.string.G13_Ans1, R.string.G13_Ans2, 13);
                        break;
                    case 8:
                        updateUI(R.string.T15_Story,R.string.T15_Ans1, R.string.T15_Ans2, 15);
                    case 9:
                    case 20:
                        updateUI(R.string.T21_Story,R.string.T21_Ans1, R.string.T21_Ans2, 21);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 10:
                    case 11:
                        updateUI(R.string.E17_Story,R.string.E17_Ans1, R.string.E17_Ans2, 17);
                        break;
                    case 12:
                    case 13:
                        updateUI(R.string.G19_Story,R.string.G19_Ans1, R.string.G19_Ans2, 19);
                        break;
                    case 14:
                    case 15:
                        updateUI(R.string.T27_Story,R.string.T27_Ans1, R.string.T27_Ans2, 27);
                        break;
                    case 16:
                        updateUI(R.string.E23_Story,R.string.E23_Ans1, R.string.E23_Ans2, 23);
                        break;
                    case 17:
                    case 28:
                        updateUI(R.string.E29_Story,R.string.E29_Ans1, R.string.E29_Ans2, 29);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 21:
                        updateUI(R.string.T32_Story,R.string.T32_Ans1, R.string.T32_Ans2, 32);;
                        mTopButton.setVisibility(View.VISIBLE);
                        break;
                    case 24:
                    case 25:
                        updateUI(R.string.G37_Story,R.string.G37_Ans1, R.string.G37_Ans2, 37);
                        break;
                    case 29:
                        updateUI(R.string.E40_Story,R.string.E40_Ans1, R.string.E40_Ans2, 40);
                        break;
                    case 30:
                        updateUI(R.string.G42_Story,R.string.G42_Ans1, R.string.G42_Ans2, 42);;
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 32:
                        updateUI(R.string.T44_Story,R.string.T44_Ans1, R.string.T44_Ans2, 44);
                        break;
                    case 36:
                        updateUI(R.string.G49_Story,R.string.G49_Ans1, R.string.G49_Ans2, 49);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 40:
                        updateUI(R.string.E53_Story,R.string.E53_Ans1, R.string.E53_Ans2, 53);
                        break;
                    case 41:
                        updateUI(R.string.E59_Story,R.string.E59_Ans1, R.string.E59_Ans2, 59);
                        break;
                    case 42:
                        updateUI(R.string.G54_Story,R.string.G54_Ans1, R.string.G54_Ans2, 54);
                        break;
                    case 45:
                        updateUI(R.string.T63_Story,R.string.T63_Ans1, R.string.T63_Ans2, 63);
                        mTopButton.setVisibility(View.VISIBLE);
                        break;
                    case 49:
                        updateUI(R.string.G67_Story,R.string.G67_Ans1, R.string.G67_Ans2, 67);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 52:
                    case 53:
                        updateUI(R.string.E71_Story,R.string.E71_Ans1, R.string.E71_Ans2, 71);
                        break;
                    case 54:
                        updateUI(R.string.G73_Story,R.string.G73_Ans1, R.string.G73_Ans2, 73);
                        break;
                    case 58:
                    case 76:
                        updateUI(R.string.E77_Story,R.string.E77_Ans1, R.string.E77_Ans2, 77);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 62:
                        updateUI(R.string.T81_Story,R.string.T81_Ans1, R.string.T81_Ans2, 81);
                        break;
                    case 67:
                        updateUI(R.string.G78_Story,R.string.G78_Ans1, R.string.G78_Ans2, 78);
                        break;
                    case 70:
                        updateUI(R.string.E76_Story,R.string.E76_Ans1, R.string.E76_Ans2, 76);
                        mTopButton.setVisibility(View.INVISIBLE);
                        break;
                    case 72:
                    case 73:
                        updateUI(R.string.G84_Story,R.string.G84_Ans1, R.string.G84_Ans2, 84);
                        break;
                    case 77:
                        updateUI(R.string.E82_Story,R.string.E82_Ans1, R.string.E82_Ans2, 82);
                        break;
                    case 79:
                        updateUI(R.string.G91_Story,R.string.G91_Ans1, R.string.G91_Ans2, 91);
                        break;
                    case 84:
                        updateUI(R.string.G97_Story,R.string.G97_Ans1, R.string.G97_Ans2, 97);
                        break;
                    case 98:
                        updateUI(R.string.T99_Story, R.string.T99_Ans1, R.string.T99_Ans2,99);
                        break;
                    default:
                        updateUI(R.string.Temp_Story, R.string.Temp_Ans1, R.string.Temp_Ans2, 0);
                }
            }
        });
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("IndexKey", mStoryIndex);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    // method that takes to update the user interface. Takes string ids for textview and buttons as well as current index as parameters.
    public void updateUI(int textView, int topButton, int bottomButton, int index) {
        mStoryTextView.setText(textView);
        mTopButton.setText(topButton);
        mBottomButton.setText(bottomButton);
        mStoryIndex = index;
    }
}
