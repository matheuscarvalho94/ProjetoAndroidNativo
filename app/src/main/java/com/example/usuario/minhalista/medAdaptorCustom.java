package com.example.usuario.minhalista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by usuario on 22/11/16.
 */

public class medAdaptorCustom extends ArrayAdapter{


    public medAdaptorCustom(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public void add(Object object) {
        super.add(object);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;

        row = convertView;
        DataHandler handler;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.minha_celula,parent, false);
            handler = new DataHandler();
            handler.imagemIcone = (ImageView)row.findViewById(R.id.imagemIcone);
            handler.textoNome = (TextView)row.findViewById(R.id.textoNome);
            handler.textoDescricao = (TextView)row.findViewById(R.id.textoDescricao);
            row.setTag(handler);
        }else{
            handler = (DataHandler)row.getTag();
        }

        MeuDataProvider dataProvider;
        dataProvider = (MeuDataProvider) this.getItem(position);
        handler.imagemIcone.setImageResource(dataProvider.getIcone());
        handler.textoNome.setText(dataProvider.getNome());
        handler.textoDescricao.setText(dataProvider.getDescricao());

        return row;
    }

    private class DataHandler {
        ImageView imagemIcone;
        TextView textoNome;
        TextView textoDescricao;
    }
}
