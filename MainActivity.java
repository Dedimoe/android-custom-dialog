package net.dedim.myApp1;

/**
 * The Functions created by Dedimoe on 04/05/19.
 */

public class MainActivity extends BaseActivity {

    ImageView ivSidikJari;
    ImageView ivFaceRecognition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHomepageBarColor();
        setContentView(R.layout.activity_main);
        
        this.setupView();
    }

    private void setupView() {
        ivSidikJari = findViewById(R.id.ivSidikJari);
        ivFaceRecognition = findViewById(R.id.ivFaceRecognition);

        ivSidikJari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogSidikJari();
            }
        });
        ivFaceRecognition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogFaceRecognition();
            }
        });
    }

    private void showDialogSidikJari() {
        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.modal_sidikjari, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showDialogFaceRecognition() {
        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.modal_facerecognition, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
