package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ArrayList<Contact> contacts;

        //recycle grid
        private RecyclerView.LayoutManager mLayoutManager;
//    private Context mContext;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);




            RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

            // Initialize contacts
            contacts = Contact.createContactsList(20);
            // Create adapter passing in the sample user data
            ContactsAdapter adapter = new ContactsAdapter(contacts);
            // Attach the adapter to the recyclerview to populate items
            rvContacts.setAdapter(adapter);
            // Set layout manager to position the items

            //recycle list
//        rvContacts.setLayoutManager(new LinearLayoutManager(this));
            // That's all!


//        recycle grid
//        mLayoutManager = new GridLayoutManager(this,3);
//        rvContacts.setLayoutManager(mLayoutManager);

//        //recycle staggered grid
            mLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
            rvContacts.setLayoutManager(mLayoutManager);
        }
    }
