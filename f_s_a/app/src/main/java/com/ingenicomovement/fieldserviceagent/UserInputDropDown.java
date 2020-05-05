package com.ingenicomovement.fieldserviceagent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ingenicomovement.fieldserviceagent.pojo.ResponseInProgAssign;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitMethod;
import com.ingenicomovement.fieldserviceagent.retrofit.RetrofitUrl;
import com.ingenicomovement.fieldserviceagent.util.SignatureUtility;

import java.io.ByteArrayOutputStream;

import okhttp3.MediaType;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserInputDropDown extends AppCompatActivity {


    public TextView textView_satu, textView_dua, textView_tiga, textView_empat, textView_lima,
    textView_enam, textView_tujuh, textView_delapan, textView_sembilan, textView_sepuluh,
    textView_sebelas, textView_duabelas, textView_tigabelas, textView_empatbelas, textView_lima_belas,
    textView_enambelas, textView_tujuhbelas, textView_delapan_belas, textView_sembilanbelas, textView_duapuluh,
    textView_duapuluhsatu, textView_duapuluhdua, textView_duapuluh_tiga, textView_dua_puluhempat, textView_duapuluhlima,
    textView_duapuluhenam, textView_duapuluhtujuh, textView_duapuluhdelapaan;

    public ImageView imageView_1, imageView_2, imageView_3, imageView_4;
    public TextView textView_id_detail_in_progg;

    int PERMISSION_ID = 44;
    FusedLocationProviderClient mFusedLocationClient;
    TextView latTextView, lonTextView;

    private static final String TAG = UserInputDropDown.class.getSimpleName();
    //private static final int CAMERA_REQUEST_CODE = 7777;
    private static final int CAMERA_CODE_SATU = 01;
    private static final int CAMERA_CODE_DUA=02;
    private static final int CAMERA_CODE_TIGA=03;
    private static final int CAMERA_CODE_EMPAT=04;

    public Button button_sb_;

    private SignatureUtility signatureUtility;

    public TextView textViewjb_id;
    public EditText editText_picName, editTextPicNumber, editText_snEdc, editText_sensim, editText_note;
    public Spinner spinner_status;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input_drop_down);
        textView_satu=findViewById(R.id.shoope_in_prog_id);
        textView_dua=findViewById(R.id.shopee_detail_iport_date);
        textView_tiga=findViewById(R.id.shopee_ticket_receive);
        textView_empat=findViewById(R.id.shopee_datail_banks);
        textView_lima=findViewById(R.id.shopee_detail_bank_sajah);
        textView_enam=findViewById(R.id.shopee_detail_case);
        textView_tujuh=findViewById(R.id.shope_contract_number);
        textView_delapan=findViewById(R.id.shope_detail_ticket_number);
        textView_sembilan=findViewById(R.id.shope_detail_spk_number);
        textView_sepuluh=findViewById(R.id.shope_detail_work_type);
        textView_sebelas=findViewById(R.id.shopee_detail_tid);
        textView_duabelas=findViewById(R.id.shopee_detail_tid_cimb);
        textView_tigabelas=findViewById(R.id.shopee_detail_mid);
        textView_empatbelas=findViewById(R.id.shopee_detail_merchant_name);
        textView_lima_belas=findViewById(R.id.shopee_detail_merc_adres);
        textView_enambelas=findViewById(R.id.shopee_detail_addres_mrchnt_dua);
        textView_tujuhbelas=findViewById(R.id.shopee_detail_post_code);
        textView_delapan_belas=findViewById(R.id.shopee_detail_city);
        textView_sembilanbelas=findViewById(R.id.shopee_detail_pict_name);
        textView_duapuluh=findViewById(R.id.shopee_detail_pic_numb);
        textView_duapuluhsatu=findViewById(R.id.shope_deail_note);
        textView_duapuluhdua=findViewById(R.id.shoope_detail_damage_type);
        textView_duapuluh_tiga=findViewById(R.id.shope_detail_init_code);
        textView_dua_puluhempat=findViewById(R.id.shope_detail_sla);
        textView_duapuluhlima=findViewById(R.id.shope_detail_ssn_edc);
        textView_duapuluhenam=findViewById(R.id.shope_detail_ssn_sim);

        imageView_1=findViewById(R.id.img_prog_1);
        imageView_2=findViewById(R.id.img_prog_2);
        imageView_3=findViewById(R.id.img_prog_3);
        imageView_4=findViewById(R.id.img_prog_4);

        textView_id_detail_in_progg=findViewById(R.id.tv_id_detail_in_progress);


        latTextView = findViewById(R.id.tv_in_progg_lat);
        lonTextView = findViewById(R.id.tv_in_progg_long);
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        signatureUtility  = new SignatureUtility();

        button_sb_=findViewById(R.id.btn_submit_);

        button_sb_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        textViewjb_id=findViewById(R.id.shoope_in_prog_id);
        editText_picName=findViewById(R.id.et__in_progg_pic_name);
        editTextPicNumber=findViewById(R.id.et_in_prog_pic_numb);
        editText_snEdc=findViewById(R.id.et_in_prog_detail_edc);
        editText_sensim=findViewById(R.id.et_in_prog_detail_sim);
        editText_note=findViewById(R.id.et_in_prog_detail_note);
        spinner_status=findViewById(R.id.sp_name_);


        getLastLocation();


        imageView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_CODE_SATU);


            }
        });

        imageView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_CODE_DUA);


            }
        });

        imageView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_CODE_TIGA);

            }
        });

        imageView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_CODE_EMPAT);


            }
        });

        //getBundle
       getDetailItem();
    }

    //camera

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case (CAMERA_CODE_SATU ) :
                if(resultCode == Activity.RESULT_OK)
                {
                    // result code sama, save gambar ke bitmap
                    Bitmap bitmap;
                    bitmap = (Bitmap) data.getExtras().get("data");
                    imageView_1.setImageBitmap(bitmap);
                      }
                break;
            case (CAMERA_CODE_DUA ) :
                if(resultCode == Activity.RESULT_OK)
                {
                    // result code sama, save gambar ke bitmap
                    Bitmap bitmap;
                    bitmap = (Bitmap) data.getExtras().get("data");
                    imageView_2.setImageBitmap(bitmap);

                }
                break;

            case (CAMERA_CODE_TIGA ) :
                if(resultCode == Activity.RESULT_OK)
                {
                    // result code sama, save gambar ke bitmap
                    Bitmap bitmap;
                    bitmap = (Bitmap) data.getExtras().get("data");
                    imageView_3.setImageBitmap(bitmap);
                     }
                break;
            case (CAMERA_CODE_EMPAT ) :
                if(resultCode == Activity.RESULT_OK)
                {
                    // result code sama, save gambar ke bitmap
                    Bitmap bitmap;
                    bitmap = (Bitmap) data.getExtras().get("data");
                    imageView_4.setImageBitmap(bitmap);
                      }
                break;







        }
    }

   //getdataBundle


    public void getBundle(){

        if(getIntent().getExtras()!=null){
            /**
             * Jika Bundle ada, ambil data dari Bundle
             */
            Bundle bundle = getIntent().getExtras();
            textView_satu.setText(bundle.getString("prog_id"));
            textView_dua.setText(bundle.getString("prog_category"));
            textView_tiga.setText(bundle.getString("prog_customer"));
            textView_empat.setText(bundle.getString("prog_import_date"));
            textView_lima.setText(bundle.getString("prog_import_ticket"));
            textView_enam.setText(bundle.getString("prog_import_bank"));
            textView_tujuh.setText(bundle.getString("prog_bank"));
            textView_delapan.setText(bundle.getString("prog_case"));
            textView_sembilan.setText(bundle.getString("prog_contract_number"));
            textView_sepuluh.setText(bundle.getString("prog_ticket_number"));
            textView_sebelas.setText(bundle.getString("prog_spk_number"));
            textView_duabelas.setText(bundle.getString("prog_work_type"));
            textView_tigabelas.setText(bundle.getString("prog_tid"));
            textView_empatbelas.setText(bundle.getString("prog_tid_cimb"));
            textView_lima_belas.setText(bundle.getString("prog_mid"));
            textView_enambelas.setText(bundle.getString("prog_merchant_name"));
            textView_tujuhbelas.setText(bundle.getString("prog_merchant_address"));
            textView_delapan_belas.setText(bundle.getString("prog_merchant_address_dua"));
            textView_sembilanbelas.setText(bundle.getString("prog_postal_code"));
            textView_duapuluh.setText(bundle.getString("prog_city"));
            textView_duapuluhsatu.setText(bundle.getString("prog_pic_name"));
            textView_duapuluhdua.setText(bundle.getString("prog_pic_number"));
            textView_duapuluh_tiga.setText(bundle.getString("prog_note"));
            textView_dua_puluhempat.setText(bundle.getString("prog_damage_type"));
            textView_duapuluhlima.setText(bundle.getString("prog_init_code"));
            textView_duapuluhenam.setText(bundle.getString("prog_sla"));
//            textView_duapuluhtujuh.setText(bundle.getString(""));
          //  textView_duapuluhdelapaan.setText(bundle.getString(""));

        }

    }

    //dataMetodAPI

    public void getDetailItem(){

       // String name= t_nama.getText().toString();
        String id= textView_id_detail_in_progg.getText().toString();
        String skip ="0";
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        String _signature = signatureUtility.doSignature(_datetime,id);

        RetrofitMethod    retrofitMethod = RetrofitUrl.getRetrofit().create(RetrofitMethod.class);
        Call<ResponseInProgAssign> assignShopeeResponseCall= retrofitMethod.getAssignInProgress(id,skip, _datetime, _signature);
        assignShopeeResponseCall.enqueue(new Callback<ResponseInProgAssign>() {
            @Override
            public void onResponse(Call<ResponseInProgAssign> call, Response<ResponseInProgAssign> response) {
                if (response.isSuccessful()){
                    getBundle();

                }
            }

            @Override
            public void onFailure(Call<ResponseInProgAssign> call, Throwable t) {

            }
        });
    }

    //location

    @SuppressLint("MissingPermission")
    private void getLastLocation(){
        if (checkPermissions()) {
            if (isLocationEnabled()) {
                mFusedLocationClient.getLastLocation().addOnCompleteListener(
                        new OnCompleteListener<Location>() {
                            @Override
                            public void onComplete(@NonNull Task<Location> task) {
                                Location location = task.getResult();
                                if (location == null) {
                                    requestNewLocationData();
                                } else {
                                    latTextView.setText(location.getLatitude()+"");
                                    lonTextView.setText(location.getLongitude()+"");
                                }
                            }
                        }
                );
            } else {
                Toast.makeText(this, "Turn on location", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
        } else {
            requestPermissions();
        }
    }


    @SuppressLint("MissingPermission")
    private void requestNewLocationData(){

        LocationRequest mLocationRequest = new LocationRequest();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setInterval(0);
        mLocationRequest.setFastestInterval(0);
        mLocationRequest.setNumUpdates(1);

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        mFusedLocationClient.requestLocationUpdates(
                mLocationRequest, mLocationCallback,
                Looper.myLooper()
        );

    }


    private LocationCallback mLocationCallback = new LocationCallback() {
        @Override
        public void onLocationResult(LocationResult locationResult) {
            Location mLastLocation = locationResult.getLastLocation();
            latTextView.setText(mLastLocation.getLatitude()+"");
            lonTextView.setText(mLastLocation.getLongitude()+"");
        }
    };


    private boolean checkPermissions() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            return true;
        }
        return false;
    }


    private void requestPermissions() {
        ActivityCompat.requestPermissions(
                this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION},
                PERMISSION_ID
        );
    }


    private boolean isLocationEnabled() {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
                LocationManager.NETWORK_PROVIDER
        );
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_ID) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                getLastLocation();
            }
        }
    }

    @Override
    public void onResume(){
        super.onResume();
        if (checkPermissions()) {
            getLastLocation();
        }

    }

    public void kirimData(){
        String id= textView_id_detail_in_progg.getText().toString();
      //  String skip ="0";
        String _datetime  = (String) DateFormat.format("yyyyMMddhhmmss", new java.util.Date());
        String _signature = signatureUtility.doSignature(_datetime,id);
        String pic_name= editText_picName.getText().toString();
        String pic_number=editTextPicNumber.getText().toString();
        String sn_edc=editText_snEdc.getText().toString();
        String sn_sim=editText_sensim.getText().toString();
        String note= editText_note.getText().toString();
        String sp_text = spinner_status.getSelectedItem().toString();
        String latitude = latTextView.getText().toString();
        String longtid=lonTextView.getText().toString();

        MediaType MEDIA_TYPE_IMAGE = MediaType.parse("image/*");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap imageBitmap = null;
        imageBitmap.compress(Bitmap.CompressFormat.JPEG,90,byteArrayOutputStream);
       // profilePictureByte = byteArrayOutputStream.toByteArray();




    }




}
