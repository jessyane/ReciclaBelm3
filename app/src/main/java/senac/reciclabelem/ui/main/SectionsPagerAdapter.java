package senac.reciclabelem.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import senac.reciclabelem.R;
import senac.reciclabelem.Tab2Fragment;
import senac.reciclabelem.Tab3Fragment;
import senac.reciclabelem.Tab4Fragment;
import senac.reciclabelem.Tab5Fragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return PlaceholderFragment.newInstance(position + 1);
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab4Fragment();
            case 3:
                return new Tab3Fragment();
                default: return null;

        }

    }
//     public FragmentActivity getItem(int position) {
//        switch (position) {
//            case 4:
//                return new Tab4Fragment();
//            default:
//                return null;
//        }
//    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}