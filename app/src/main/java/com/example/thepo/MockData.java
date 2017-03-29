package com.example.thepo;

import android.app.LauncherActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laurahovey on 3/26/17.
 */

public class MockData {
    private static final String[] songTitles = {"Ghosts", "Singing About Andrew","Tomorrow", "Glory", "Other Side of the World", "Pennies", "Fickle","Bones, Bones, Bones", "Mercy"};
    private static final int[] iconNum = {R.drawable.sheepimage, R.drawable.cutepugimage, R.drawable.hedgehogimage, R.drawable.ducklingimage};

    private static final String[] browseTitles={"Mariachi", "KPop", "Rege","Pop", "Hiphop", "Country", "Blue Grass", "Rap", "Salsa", "Blues"};
    private static final int[] browseNum = { R.drawable.spiderimage, R.drawable.grandmaimage, R.drawable.colorfulfloorimage, R.drawable.aligatorimage, R.drawable.elephantimage, R.drawable.yellowshirtimage, R.drawable.paintingimage, R.drawable.tatoosimage, R.drawable.violinimage};

    private static final String[] browseTitles2={"Techno", "Dubstep", "Instramental", "Piano", "Classical", "Rock", "Folk", "Jazz", "Alternative", "Indie"};
    private static final int[] browseNum2 = {R.drawable.chairimage, R.drawable.cryptimage, R.drawable.chairimage, R.drawable.bicycleimage, R.drawable.concerthallimage, R.drawable.concertimage, R.drawable.friendsimage, R.drawable.recordplayerimage, R.drawable.rockimage};


    public static List<BrowseItem> getBrowseData()
    {
        List<BrowseItem> data = new ArrayList<>();

        //for(int i = 0; i<4; i++)
        //{
            for(int j = 0; j< browseTitles.length && j<browseNum.length; j++)
            {
                //if((j%2)==0)
                //{
                    BrowseItem item = new BrowseItem();
                    item.setImageResID(browseNum[j]);
                    item.setTitle(browseTitles[j]);
                    data.add(item);
                //}
                //else
                //{
                    //BrowseItem item = new BrowseItem();
                    item.setImageResID2(browseNum2[j]);
                    item.setTitle2(browseTitles2[j]);
                    //data.add(item);
                //}

            }
       // }
        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j< browseTitles2.length && j<browseNum2.length; j++)
            {

                //else

               // BrowseItem item = new BrowseItem();
                 //item.setImageResID2(browseNum2[j]);
                  //item.setTitle2(browseTitles2[j]);
                  //data.add(item);


            }
        }

        return data;
    }

    public static List<ListItem> getListData()
    {
        List<ListItem> data = new ArrayList<>();

        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j< songTitles.length && j<iconNum.length; j++)
            {
                ListItem item = new ListItem();
                item.setItemNum(iconNum[j]);
                item.setTitle(songTitles[j]);
                data.add(item);
            }
        }
        return data;
    }

}
