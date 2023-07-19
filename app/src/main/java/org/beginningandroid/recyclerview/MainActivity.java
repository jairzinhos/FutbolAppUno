package org.beginningandroid.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<MovieModel> movieList = new ArrayList<>();
    private MoviesAdapter mAdapter;
    String data;
    ArrayList<String> headers;
    TextView textView;
    ArrayList<String> listFutbolHeaders1 = new ArrayList<>();
    ArrayList<String> listFutbolDataUno = new ArrayList<>();
    ArrayList<String> numberList;
    ArrayList<String> numberTitle;
    Button button;
    String dataUno;
    String numberListUno;


    public List<ArrayList> matchesList = new ArrayList<>();
    ArrayList<String> listFutbolHeaders = new ArrayList<String>();
    //ArrayList<String> numberList = (ArrayList<String>) getIntent().getSerializableExtra("key");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.escriba);
        ArrayList<String> numberList = (ArrayList<String>) getIntent().getSerializableExtra("key");
        ArrayList<String> numberTitle = (ArrayList<String>) getIntent().getSerializableExtra("keyUno");
        //prepareMovieData();
        textView.setText(numberList.get(3));
        //textView.setText(numberTitle.get(0));
        numberListUno = numberList.get(0);
        //
        //
        //
        // textView.setText(numberList.toString());
        IntroActivity single = new IntroActivity();
        String singleOne = single.singleText;

        ///setContentView(R.layout.activity_intro);
        ///button = findViewById(R.id.button);
        /*
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getHtmlFromWeb();
            }
        });

         */



        /*
        View.performClick() {
            @Override
            public void onClick(View v) {
                getHtmlFromWeb();
            }
        });

         */
        //textView.setText("holi");
        ///TextView textView = findViewById(R.id.escriba);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        mAdapter = new MoviesAdapter(movieList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        /*
        try {
            getHtml();
        } catch (IOException e) {
            e.printStackTrace();
        }

         */


        /*
        IntroActivity headerList = new IntroActivity();
        ArrayList<String> headers = headerList.listFutbolHeaders1;

         */
        //String dato = headers.get(0);
        //textView.setText(headers.get(0));
        /*
        getHtmlFromWeb();

         */
        /*
        try {
            getHtmlFromWeb();
        } catch (IOException e) {
            e.printStackTrace();
        }

         */

        prepareMovieData();
    }
    /*
    private void getList() {
        ArrayList<String> numberList = (ArrayList<String>) getIntent().getSerializableExtra("key");
    }

     */

    private void prepareMovieData() {
        ArrayList<String> numberList = (ArrayList<String>) getIntent().getSerializableExtra("key");
        //getList();
        /*
        MovieModel movie = new MovieModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);
        movie = new MovieModel("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);
        movie = new MovieModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
        movie = new MovieModel("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);
        movie = new MovieModel("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);
        movie = new MovieModel("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);
        movie = new MovieModel("Up", "Animation", "2009");
        movieList.add(movie);
        movie = new MovieModel("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);
        movie = new MovieModel("The LEGO MovieModel", "Animation", "2014");
        movieList.add(movie);
        movie = new MovieModel("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);
        movie = new MovieModel("Aliens", "Science Fiction", "1986");
        movieList.add(movie);
        movie = new MovieModel("Chicken Run", "Animation", "2000");
        movieList.add(movie);
        movie = new MovieModel("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);
        movie = new MovieModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);
        movie = new MovieModel("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);
        movie = new MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
        movie = new MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);

         */

        /*
        IntroActivity headerList = new IntroActivity();
        ArrayList<String> headers = headerList.listFutbolHeaders1;
        String dato = headers.get(0);


         */

        ///String uno = headers.get(0).toString();
        /*
        String header = null;
        for(int i=0; i < headers.size(); i++) {
            header = headers.get(i).toString();

        }
        
         */
        ///movie = new MovieModel("" +headers.get(0),"" + headers.get(1), "" +headers.get(2));
        /*
        IntroActivity xObj = new IntroActivity();
        int x = xObj.x;
        int y = xObj.y;
        String fut = xObj.title;

         */

        ///String dos = xObj.headDos ;
        //ArrayList<String> heads= xObj.listFutbolHeaders1;
        //String headUno = (String) listFutbolHeaders.get(0);
        //IntroActivity header = new IntroActivity();

        //String headdd;
        //headdd = (String) headers.get(0);
        /*
        IntroActivity titleObj = new IntroActivity();
        String title = titleObj.title;

         */
        //StringBuilder title = titleObj;
        //String dataUno = listFutbolHeaders1.get(2);
        /*
        movie = new MovieModel("" + numberList.get(0),"" + numberList.get(1),"" + numberList.get(2));
        movieList.add(movie);
        ///https://www.youtube.com/watch?v=ZXoGG2XTjzU&ab_channel=CodingWithMitch
        ///https://www.geeksforgeeks.org/how-to-apply-onclicklistener-to-recyclerview-items-in-android/
        /// for connecting recyclerview Buttons to a determined activity

         */
        MovieModel movie = new MovieModel(numberList.get(0), numberList.get(1), numberList.get(2), numberList.get(3));
        movieList.add(movie);

        for(int i = 0; i <numberList.size(); i = i + 4){
            MovieModel movieU = new MovieModel(numberList.get(i), numberList.get(i+1), numberList.get(i+2), numberList.get(i+3));
            movieList.add(movieU);



        }


        mAdapter.notifyDataSetChanged();

        /*
        for(int i = 0; i <3; i = i + 4){
            movie = new MovieModel(listFutbolHeaders.get(i), listFutbolHeaders.get(i+1), listFutbolHeaders.get(i+2));
            movieList.add(movie);



        }

         */

    }

    /*
    private void getHtmlFromWeb() throws IOException {
        //ArrayList<String> listFutbolHeaders = new ArrayList<String>();
        try {


            Document doc = null;
            doc = Jsoup.connect("https://www.futbolred.com/parrilla-de-futbol").get();

            Elements links = doc.select("table");
            Elements ths = links.select("th");
            for (Element titulo : ths) {
                listFutbolHeaders.add(titulo.text());
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

     */
    //Document doc = Jsoup.connect("http://www.tutorialspoint.com/").get();
    private void getHtmlFromWeb() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                final StringBuilder titulos = new StringBuilder();
                ///ArrayList<String> listFutbolHeaders = new ArrayList<String>();

                ArrayList<String> listFutbolData = new ArrayList<String>();

                //Document doc = Jsoup.connect("https://www.futbolred.com/parrilla-de-futbol").get();
                Document doc = null;
                try {
                    doc = Jsoup.connect("https://www.futbolred.com/parrilla-de-futbol").get();

                    //String title = doc.title();
                    //String title = doc.selectFirst("div[class");
                    JSONObject jsonParentObject = new JSONObject();
                    //*****JSONArray list = new JSONArray();
                    ///Elements links = doc.select("a[href]");
                    Elements links = doc.select("table");
                    Elements ths = links.select("td");
                    //listFutbolHeaders.add(ths.text());

                    for (Element titulo : ths) {
                        listFutbolHeaders.add(titulo.text());
                    }
                    for (int i = 0; i < listFutbolHeaders.size(); i++) {
                        listFutbolHeaders1.add(listFutbolHeaders.get(i));
                    }

                    //Elements headers = links.select("th");
                    titulos.append(ths.text());


                    //for (Element header : ths) {
                    //titulos.append(header.text()).append(", ");
                    //}

                    //Elements tables = links.select("tr");
                    //stringBuilder.append(links).append("");

                    ///stringBuilder.append(links).append("");
                    //for (Element link : links) {
                    //stringBuilder.append("").append("Link : ").append(link.attr("href")).append(" ").append("Text : ").append(link.text());
                    //}
                } catch (IOException e) {
                    e.printStackTrace();
                }

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //text3.setText(Html.fromHtml(stringBuilder.toString()));
                        //title = listFutbolHeaders.get(0);
                        //textView.setText("" + listFutbolHeaders1.get(1));
                        //textView.setText(numberList.toString());
                        String dataUno = listFutbolHeaders1.get(2);
                        //prepareMovieData();
                        //singleText = listFutbolHeaders1.get(2);
                        //List<String> listFutbolHeaders1 = listFutbolHeaders;
                        ///for(String titulo: listFutbolHeaders){

                        //}
                        //String headDos = listFutbolHeaders1.get(0).toString();
                    }
                });
            }
        }).start();
    }

    /*
    public  void getHtml () throws IOException {
        ///ArrayList<String> listFutbolDataUno = new ArrayList<String>();


        Document doc = null;
        doc = Jsoup.connect("https://www.futbolred.com/parrilla-de-futbol").get();
        Elements links = doc.select("table");
        Elements ths = links.select("td");
        for(Element titulo : ths) {
            listFutbolDataUno.add(titulo.text());
        }

        textView.setText("" + listFutbolDataUno.get(2));








    }

     */
    private class Content extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }
}