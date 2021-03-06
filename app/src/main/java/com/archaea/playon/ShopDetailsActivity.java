package com.archaea.playon;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.archaea.models.LruBitmapCache;
import com.archaea.models.Shop;

public class ShopDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        ImageLoader imageLoader = new ImageLoader(Volley.newRequestQueue(this), new LruBitmapCache());
        NetworkImageView coverPhoto = (NetworkImageView) findViewById(R.id.shop_cover_photo);
        coverPhoto.setImageUrl("http://192.168.174.1:9080/assets/img/app/typography/typo03.png", imageLoader);
        coverPhoto.setScaleType(ImageView.ScaleType.FIT_XY);
        Shop shop = (Shop) getIntent().getSerializableExtra("shopObject");
        TextView shopDetailedDescription = (TextView) findViewById(R.id.shop_detail_description);
        shopDetailedDescription.setText(shop.getShopDescription());
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.shop_details_toolbar);
        collapsingToolbarLayout.setTitle(shop.getShopName());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
