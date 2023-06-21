/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.recipe_book;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a basic RecyclerView that displays a list of generated words.
 * - Clicking an item marks it as clicked.
 * - Clicking the fab button adds a new recipe_tittle to the list.
 */
public class MainActivity extends AppCompatActivity {

    private List<ListItem> listItems;

    private String recipeName;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        // Put initial data into the recipe_tittle list.

        listItems = new ArrayList<>();
        listItems.add(new ListItem("Vegeterian Kids Lunch Box", "A lunch box filled with scrumptious dishes for kids to enjoy their lunch time.  Kids love to be enterained with varieties and I have compiled into delectable dishes for the little ones to munch on.", "Ingredients:\nFor Masala Veg Idly : Idly batter 1 cup\n1/3 cup finely chopped carrot, peas and corn\n1/4 teaspoon turmeric powder\n1/4 teaspoon chilli powder\n1 teaspoon Ghee\n2 Pinches of Himalaya salt for Idly batter\nFor Babycorn Capsicum Stir Fry : 3/4 cup chopped Baby corns\n1/3 cup sliced Red and Yellow capsicum\n1 Finely chopped onion\n1/2 teaspoon turmeric powder\n1/2 teaspoon Chilli powder\n1/4 teaspoon Himalaya salt\nFor Curd Rice : 1 Cup cooked rice\n2/3 cup thick yogurt\n1/4 teaspoon plus 2 pinches of Himalaya salt\n1 teaspoon Soyabean flour\n1\" peeled Ginger\n1/2 Green chilli\n3 curry leaves\n1 teaspoon chopped green coriander leaves\n1 teaspoon Oil\n1/4 teaspoon mustard seeds\n1/4 teaspoon Urad dhal\n1/4 teaspoon Asafoetida\nFor Dates Cashewnut Kozhukattai : 1/2 Cup rice flour\n1 cup water\n2 pinches of Himalaya salt\n6 Pitted Dates\n3/4 teaspoon Ghee\n6 Cashew nuts\n1 Apple", "@drawable/p1"));
        listItems.add(new ListItem("Butter Chicken", "Butter Chicken (Murgh Makhani) is one of the most popular curries in the world and yet happens to be one of the easiest! No hunting down hard to find ingredients, this chef recipe that makes the most incredible curry sauce.", "As someone who loves food with big, BIG flavours, it’s no surprise that Indian is one of my favourite foods. A good curry and binge watching Netflix is pretty much my idea of a perfect Friday night.\nAs much as I love making Indian food at home, sometimes I find the list of ingredients daunting. It’s easy enough to make once I gather all the ingredients, but that’s where I usually fall short because it requires a trip to an Indian grocery store – and my closest one is a fair drive away.\nButter Chicken is one of the few exceptions. I was elated when I discovered a Chef recipe for Butter Chicken and realised how easy it is. But more importantly, you can get all the ingredients from any supermarket. Yes!\nIs Butter Chicken really Indian??\nYES it is! It’s called Murgh Makhani and it hails from Northern India. It’s quite a mild curry compared to many Indian curries, and outside of India, it’s become just about everybody’s favourite curry!\nThe beautiful Butter Chicken Sauce mostly gets its richness from cream. While some restaurants take it over the top by stirring in a (very!) generous amount of butter into the sauce at the end, I find that it’s rich enough as it is. The Butter Chicken flavour and experience – but less oily than restaurant versions!", "@drawable/p2"));
        listItems.add(new ListItem("Beef Enchiladas", "Simple ones, filled with a plain cooked beef filling then topped with enchilada sauce and (lots of) cheese. Fancy ones with the addition of chillies, beans, corn and even olives, sometimes even bacon.", "Shredded beef enchiladas, short rib ones.\nAnd today I’m sharing mine. It’s made with:\nA simple homemade Enchilada sauce which is quick to make and so, SO much better than store bought;\nA flavour loaded beef and bean filling which is made with ground beef (mince), a load of Tex-Mex spices, refried beans AND black beans. Bean overload? Definitely not! The refried beans add bulk while keeping the filling nice and juicy so we can have nice, big, plump enchiladas!\nJust a note on a few of the ingredients:\nRefried beans – the “secret ingredient” that really fills out the beef mixture so you can big, plump, generously stuffed enchiladas that are nice and juicy. I use this in my Chicken Enchiladas too – works a treat!\nBlack beans  – to fill it out a bit and add a different texture to the filling. Diced vegetables are great to add too – especially red peppers / capsicum.\nHomemade Enchilada Sauce – made with either tomato passata or canned tomato sauce (US, I like Hunts), plus a good hit of Tex-Mex spices.\nBeef – This is a recipe for beef enchiladas so it’s made with ground beef. But it can be substituted with pork, chicken or turkey!", "@drawable/p3"));
        listItems.add(new ListItem("Carrot and Cauliflower Soup", "Toast coriander seeds in a dry pot over medium heat until fragrant and golden brown, 2 to 3 minutes. Coarsely grind in a spice grinder or crush with a mortar and pestle.", "3 tablespoons extra virgin olive oil\n1 small onion (8 ounces), finely chopped\n2 cloves garlic\n1 pound (4-6 medium) carrots\n1 pound (1 small head) cauliflower\n1 tablespoons whole coriander\n6 cups vegetable stock\n3 tablespoons white miso\nFreshly ground black pepper to taste\nSalt to taste\nPinch of smoked paprika\nDash of lemon juice\n0.5 teaspoon lemon zest\nFresh cilantro leaves, for garnish", "@drawable/p4"));
        listItems.add(new ListItem("Tomato Bisque", "Store the chive oil in a refrigerator and use it within a month. Remove the oil from the refrigerator a couple hours before using in case any congealing occurs.", "4 tablespoons butter\n1/2 large onion\n1 medium carrot\n1/2 celery stalk\n4 garlic cloves\n2 tablespoons tomato paste\n5 tablespoons AP flour\n5 cups chicken stock\n4 cups crushed tomato\n3 parsely sprigs\n3 thyme sprigs\n2 bay leaves\n2 teaspoons salt\n1 teaspoon pepper", "@drawable/p5"));
        listItems.add(new ListItem("Kale Salad", "Kale grows strong and mighty in Alaska in July and August. One day, when our root cellar was overflowing with this delicious green, our cook Janet suggested this as an alternative to pan-frying and a new favorite salad was born!", "Kale grows strong and mighty in Alaska in July and August. One day, when our root cellar was overflowing with this delicious green, our cook Janet suggested this as an alternative to pan-frying and a new favorite salad was born!\nBoth guests and staff love this salad and this recipe is a great way to showcase how good raw kale can be. The acids in the Braggs Amino Acids and the lemon juice help break down the kale similar to sautéing the green, but while better maintaining its health benefits. We’ve found that letting the salad marinate longer and massaging it occasionally makes for a more tender end result. This salad is still good the following day, so you might think about making a little extra. \nThis recipe originally comes from the Esalen Cookbook.", "@drawable/p6"));

        // Create an adapter and supply the data to be displayed.
        adapter = new MyAdapter(listItems, this);
        // Connect the adapter with the recycler view.
        recyclerView.setAdapter(adapter);
        }

    /**
     * Inflates the menu, and adds items to the action bar if it is present.
     *
     * @param menu Menu to inflate.
     * @return Returns true if the menu inflated.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handles app bar item clicks.
     *
     * @param item Item clicked.
     * @return True if one of the defined items was clicked.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // This comment suppresses the Android Studio warning about simplifying
        // the return statements.
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
