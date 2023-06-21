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

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Shows how to implement a simple Adapter for a RecyclerView.
 * Demonstrates how to add a click handler for each item in the ViewHolder.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    /**
     * Called when RecyclerView needs a new ViewHolder of the given type to
     * represent an item.
     *
     * This new ViewHolder should be constructed with a new View that can
     * represent the items of the given type. You can either create a new View
     * manually or inflate it from an XML layout file.
     *
     * The new ViewHolder will be used to display items of the adapter using
     * onBindViewHolder(ViewHolder, int, List). Since it will be reused to
     * display different items in the data set, it is a good idea to cache
     * references to sub views of the View to avoid unnecessary findViewById()
     * calls.
     *
     * @param parent   The ViewGroup into which the new View will be added after
     *                 it is bound to an adapter position.
     * @param viewType The view type of the new View. @return A new ViewHolder
     *                 that holds a View of the given view type.
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate an item view.
        View v = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.wordlist_item, parent, false);
        return new ViewHolder(v, this);
    }

    /**
     * Called by RecyclerView to display the data at the specified position.
     * This method should update the contents of the ViewHolder.itemView to
     * reflect the item at the given position.
     *
     * @param holder   The ViewHolder which should be updated to represent
     *                 the contents of the item at the given position in the
     *                 data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);
        holder.textViewHead.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {
        //public final TextView wordItemView; //!!!!!!!!
        public TextView textViewHead;
        public TextView textViewDesc;
        final MyAdapter mAdapter;

        /**
         * Creates a new custom view holder to hold the view to display in
         * the RecyclerView.
         *
         * @param itemView The view in which to display the data.
         * @param adapter The adapter that manages the the data and views
         *                for the RecyclerView.
         */
        public ViewHolder(View itemView, MyAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            textViewHead = (TextView) itemView.findViewById(R.id.recipe_tittle);
            textViewDesc = (TextView) itemView.findViewById(R.id.recipe_short);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            System.out.println("QQQQQQQQQQQQQQQQQQQQQ clicked" + mPosition);
            System.out.println("listItem: get (mPosition).getHead(): " + listItems.get(mPosition).getHead());
            System.out.println("listItem: get (mPosition).getDesc(): " + listItems.get(mPosition).getDesc());
            System.out.println("listItem: get (mPosition).getContent(): " + listItems.get(mPosition).getContent());
            System.out.println("listItem: get (mPosition).getImage(): " + listItems.get(mPosition).getImage());

            final Intent intent;
            intent =  new Intent(context, RecipeActivity.class);
            intent.putExtra("head", listItems.get(mPosition).getHead());
            intent.putExtra("desc", listItems.get(mPosition).getDesc());
            intent.putExtra("content", listItems.get(mPosition).getContent());
            intent.putExtra("image", listItems.get(mPosition).getImage());
            context.startActivity(intent);
        }
    }
}
