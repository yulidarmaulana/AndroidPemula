package com.dicoding.picodiploma.androidpemula;

import com.dicoding.picodiploma.androidpemula.R;
import com.dicoding.picodiploma.androidpemula.model.Kelas;

import java.util.ArrayList;

public class DataKelas {
    private static String[] namaKelas = {
            "Pemprograman Java",
            "Pemprograman Kotlin",
            "Android Pemula",
            "Game Pemula",
            "Argumented Reality",
            "Android Expert",
            "Kotlin Expert",
            "Game Expert",
            "Flutter Expert",
            "Android Jetpack Pro"
    };

    private static String[] detailKelas = {
           "oleh Dicoding Indonesia" +
                    "\n\n" + "Belajar Bahasa Java buat kamu yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) terpopuler untuk mengembangkan aplikasi.\n" +
                             "Kelas ini didesain oleh para kontributor, tim Dicoding, dan telah direview oleh Dr.Ir. Inggriani Liem (ITB/ AI TOKO/BEBRAS NBO), dan disesuaikan untuk Anda yang ingin mempelajari konsep Pemprograman Berorientasi Objek (PBO) maupun mempelajari struktur bahasa java secara umum. Bahasa Java akan digunakan dalam kelas-kelas lanjutan di Dicoding, diantaranya Belajar Membuat Aplikasi Android untuk Pemula dan Menjadi Android Developer Expert.",
            "oleh Dicoding Indonesia" +
                    "\n\n" + "Kelas pengantar untuk mempelajari Functional Programming serta Object-Oriented Programming menggunakan kotlin.\n" +
                             "Kotlin merupakan bahasa pemprograman berorientasi objek dan fungsional. Kotlin sangat terkenal di kalangan developer dengan semua kemudahan dan fitur yang ditawarkan. Oleh karena itu, akademi ini didirikan agar pengguna Kotlin dapat memiliki pemahaman mendalam tentang konsep dasar Kotlin.",
            "oleh Google ATP" +
                    "\n\n" + "Mulai perjalanmu jadi Android Engineer dengan materi yang disusun oleh Dicoding sebagai Google Authorized Traning Partner" +
                             "Dicoding sebagai satu-satunya Google Developers Authorized Training Patner di Indonesia telah melalui proses penyusun kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini.",
            "oleh Asosiasi Game Indonesia" +
                    "\n\n" + "Belajar memulai mengembangkan Game dengan Unity menggunakan kurikulum yang diverifikasi Asosiasi Game Indonesia\n" +
                             "Profesi Game Dev di Indonesia, sangat menjanjikan. Potensi industri Game nasional sangat pesat. Tahun 2017 nilainya tercatat Rp 11 Triliun dan tumbuh 25-30% per tahun(Kompas). Di kelas ini Anda akan mempelajari kemampuan-kemampuan dasar sebagai game developer.",
            "oleh Dicoding Indonesia" +
                    "\n\n" + "Di era Industri 4.0 saat ini, teknologi Augmented Reality menjadi masa depan yang canggih\n" +
                             "Augmented Reality (AR) adalah teknologi yang menggabungkan benda maya dua dimensi dan ataupun tiga dimensi ke dalam sebuah lingkungan nyata tiga dimensi, lalu memproyeksikan benda-benda maya tersebut dalam waktu nyata.",
            "oleh Google ATP" +
                    "\n\n" + "Jadilah expert di dunia pemprograman Android. Materi disusun oleh Dicoding sebagai\n"+
                             "Dicoding sebagai satu-satunya Google Developers Authorized Training Patner di Indonesia telah melalui proses penyusun kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini.",
            "oleh Dicoding Indonesia" +
                "\n\n" + "Kuasai kotlin, bahasa yang didukung Google untuk Android. Didesain bagi Android developer Java yang ingin belajar kotlin\n"+
                         "Kotlin memungkinkan untuk kita menuliskan kode-kode dalam pengembangan  aplikasi Android menjadi lebih sederhana dan mudah dipahami.Beberapa perusahaan besar pun sudah menerapkan Kotlin sebagai bahasa pemrograman untuk pengembang aplikasi android.",
            "oleh Asosiasi Game Indonesia" +
                    "\n\n" + "Jadilah seorang Game Developer Expert menggunakan Unity. Dapatkan pengalaman bikin 8 jeni  game Unity di kelas ini",
            "oleh GITS Indonesia" +
                    "\n\n" + "Jadilah developer yang dapat membuat aplikasi cross-platform(Android-iOS) yang cantik dan juga mudah.\n"+
                             "Flutter adalah teknologi untuk membangun suatu mobile apps yang dibuat dari Google. Dengan menggunakan Flutter, anda dapat membuat aplikasi Android dan iOS sekaligus. Flutter menggunakan bahasa Dart yang juga dibuat oleh Google dan merupakan bahasa general purpose. Artinya, Dart mampu berjalan dibanyak platform.",
            "oleh Goole ATP" +
                    "\n\n" + "Mari belajar Jetpack, Kumpulan library, tools, dan architecture, yang bisa bikin level-up skill Androi-mu\n"+
                             "Android Jetpack terinspirasi oelh Support Library, seperangkat komponen untuk memudahkan pemanfaatan fitur Android terbaru sembari tetap menjaga kompabilitas dengan versi-versi sebelumnya. Android Jetpack saat ini digunakan oleh 80% dari 1000 aplikasi terbaik di Play Store. Berdasarkan kesuksesan tersebut Google memperkenalkan Architecture Components, yang dirancang untuk memudahkan penggunaan data dalam menghadapi perubahan dan detail siklus hidup aplikasi."
    };

    private static int[] photoKelas = {
            R.drawable.pemrograman_java,
            R.drawable.pemrograman_kotlin,
            R.drawable.android_pemula,
            R.drawable.game_pemula,
            R.drawable.augmented_reality,
            R.drawable.android_expert,
            R.drawable.kotlin_expert,
            R.drawable.game_expert,
            R.drawable.flutter_expert,
            R.drawable.android_jetpack_pro
    };

    static ArrayList<Kelas> getListData() {
        ArrayList<Kelas> list = new ArrayList<>();
        for (int position=0; position < namaKelas.length; position++) {
            Kelas kelas = new Kelas();
            kelas.setNama(namaKelas[position]);
            kelas.setDetail(detailKelas[position]);
            kelas.setPhoto(photoKelas[position]);
            list.add(kelas);
        }
        return list;
    }
}