package com.biz.my_memo_app.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.biz.my_memo_app.fragment.MemoViewFragment;

import java.util.List;

public class MemoViewPagerAdapter extends FragmentStatePagerAdapter {

    List<String> pageTitles ;

    public MemoViewPagerAdapter(FragmentManager fm) {
        super( fm );
    }

    public MemoViewPagerAdapter(FragmentManager fm, List<String> pageTitles) {
        super( fm );
        this.pageTitles = pageTitles ;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle( position );
        return pageTitles.get( position ).toString() ;
    }

    @Override
    public Fragment getItem(int position) {
        return new MemoViewFragment();
    }

    @Override
    public int getCount() {
        return pageTitles.size();
    }
}
