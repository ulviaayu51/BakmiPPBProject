package com.bismillah.penyetan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PageAdapter extends FragmentPagerAdapter {
    private int numberoftabs;

    public PageAdapter(FragmentManager fm, int numberoftabs ) {
        super(fm);
        this.numberoftabs = numberoftabs;
    }



    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new katalog();

            case 1:
                return new hadiah();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
