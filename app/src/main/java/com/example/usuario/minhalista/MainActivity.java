package com.example.usuario.minhalista;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView minhaLista;

    private String[] listaDeNomes = {"Marcos", "Magno", "Alexandre", "Marcelo", "Magda", "Walquiria", "Taise", "Massariol", "Samir", "Tonhão"};
    private String[] listaDescricao = {"Meu Nome é Marcos",
            "Meu Nome é Magno",
            "Meu Nome é Alexandre",
            "Meu Nome é Marcelo",
            "Meu Nome é Magda",
            "Meu Nome é Walquiria",
            "Meu Nome é Taise",
            "Meu Nome é Massariol",
            "Meu Nome é Samir",
            "Meu Nome é Tonhão"};

    int[] listaIcones = {R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a6,
            R.drawable.a7,
            R.drawable.a8,
            R.drawable.a9,
            R.drawable.a10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaLista = (ListView) findViewById(R.id.lista);

        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listaDeNomes
        );
//        minhaLista.setAdapter(meuAdaptador);

        minhaLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String textonome = listaDeNomes[position];
                Toast.makeText(getApplicationContext(), textonome, Toast.LENGTH_SHORT).show();
            }
        });

        medAdaptorCustom adaptador;

        int i = 0;

        adaptador = new medAdaptorCustom(getApplicationContext(), R.layout.minha_celula);

        for (String nome:listaDeNomes){
            MeuDataProvider dataProvider = new MeuDataProvider(listaIcones[i], nome, listaDescricao[i]);
            adaptador.add(dataProvider);
            i++;
        }
        minhaLista.setAdapter(adaptador);
    }
}

