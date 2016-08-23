package br.com.eaj.ufrn.lucas.linearlayout;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.Gravity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int pixels10dip = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
        int pixelsdip = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, getResources().getDisplayMetrics());

        TableLayout tabela = new TableLayout(this);
        tabela.setPadding(10, 10, 10, 10);
        tabela.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        // Expande a coluna 1
        tabela.setColumnStretchable(0, true);

        //Define o cabeçalho e o adiciona no layout
        TextView cabecalho = new TextView(this);
        cabecalho.setText("Lista de produtos");
        tabela.addView(cabecalho);

        //Definindo a primeira view "linha que ficará embaixo do cabeçalho"
        View view = new View(this);
        //vai oculpar toda a largura "match"
        view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, pixelsdip));
        view.setBackgroundColor(Color.parseColor("#FF909090"));
        tabela.addView(view);

        // Linha 1
        TableRow linha1 = new TableRow(this);
        //cria e seta o valor do textView com valor café e o valor do café
        TextView cafe = new TextView(this);
        cafe.setText("Café");
        linha1.addView(cafe);

        TextView valorCafe = new TextView(this);
        valorCafe.setText("R$ 1.50");
        linha1.addView(valorCafe);

        // Linha 2
        TableRow linha2 = new TableRow(this);

        TextView pizza = new TextView(this);
        pizza.setText("Pizza");
        linha2.addView(pizza);

        TextView valorPizza = new TextView(this);
        valorPizza.setText("R$ 12.00");
        linha2.addView(valorPizza);

        // Linha 3
        TableRow linha3 = new TableRow(this);

        TextView agua = new TextView(this);
        agua.setText("Água");
        linha3.addView(agua);

        TextView valorAgua = new TextView(this);
        valorAgua.setText("R$ 3.00");
        linha3.addView(valorAgua);

        // Adiciona as linhas da tabela ao TableLayout
        tabela.addView(linha1);
        tabela.addView(linha2);
        tabela.addView(linha3);

        //Criando a segunda view 'linha'
        View view2 = new View(this);
        //vai oculpar toda a largura "match"
        view2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, pixelsdip));
        view2.setBackgroundColor(Color.parseColor("#FF909090"));
        tabela.addView(view2);

        // Definindo o layout Linear para organizar os botões de comprar e cancelar
        LinearLayout linear = new LinearLayout(this);
        linear.setPadding(pixels10dip, pixelsdip, pixels10dip, pixelsdip);
        linear.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
       // linear.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL );
        linear.setGravity(Gravity.CENTER_HORIZONTAL);


        Button comprar = new Button(this);
        comprar.setText("Comprar");

        Button cancelar = new Button(this);
        cancelar.setText("ancelar");


        //Adiciona os botões ao layout linear
        linear.addView(comprar);
        linear.addView(cancelar);

        //Adiciona o layout linear ao tablelinear, para que os elementos contidos no linear apareçam
        tabela.addView(linear);

        setContentView(tabela);

    }
}
