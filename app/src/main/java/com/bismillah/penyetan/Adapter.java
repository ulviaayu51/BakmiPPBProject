package com.bismillah.penyetan;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Adapter  extends FragmentPagerAdapter {
    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                tab_informasi tab1=new tab_informasi();
                return tab1;
            case 1:
                tab_profil tab2=new tab_profil();
                return tab2;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

}
