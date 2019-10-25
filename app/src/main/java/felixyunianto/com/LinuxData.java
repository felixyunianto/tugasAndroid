package felixyunianto.com;

import java.util.ArrayList;

public class LinuxData {
    private static String[] linuxNames = {
            "Ubuntu",
            "Linux Mint",
            "Cent OS",
            "Ubuntu Mate",
            "Kali Linux",
            "Steam OS",
            "Debian",
            "Elementary OS",
            "UberMix",
            "Linux Tails"
    };

    private static String[] linuxDetails = {
            "Ubuntu merupakan salah satu distribusi Linux yang berbasis Debian dan didistribusikan sebagai perangkat lunak bebas. Ubuntu ditawarkan dalam tiga edisi resmi: Ubuntu Desktop untuk komputer pribadi, Ubuntu Server untuk server dan komputasi awan, dan Ubuntu Core untuk \"Internet untuk Segala\", perangkat kecil dan robot.",
            "Linux Mint merupakan distribusi Linux berbasis Debian-Ubuntu yang bertujuan untuk \"membuat sistem operasi yang modern, elegan, dan nyaman yang kuat dan mudah dipakai\". Dibuat oleh Clement Lefebvre, dan dikembangkan secara aktif oleh tim maupun komunitas yang ada di dalamnya.",
            "CentOS adalah sebuah distribusi linux sebagai bentuk dari usaha untuk menyediakan platform komputasi berkelas enterprise yang memiliki kompatibilitas kode biner sepenuhnya dengan kode sumber yang menjadi induknya, Red Hat Enterprise Linux.",
            "Ubuntu MATE adalah distribusi linux sumber terbuka gratis dan aplikasi resmi turunan dari Ubuntu. Ubuntu MATE diturunkan dari Ubuntu yang menggunakan lingkungan desktop MATE sebagai antarmuka pengguna baku, MATE merupakan lingkungan desktop turunan GNOME 2 yang digunakan untuk Ubuntu dibawah versi 11.04, sebelum menggunakan antar muka pengguna grafis Unity. Unity merupakan antar muka default ubuntu desktop saat ini, atau GNOME Shell mulai Ubuntu 17.10.",
            "Kali Linux adalah distro turunan Debian dan juga penerus BackTrack yang digunakan untuk melakukan penetrasi pada jaringan. Kali Linux memiliki ±300 tools yang ada di dalamnya dengan fungsi masing-masing. Kali Linux juga bersifat Live CD dan Installasi manual.",
            "SteamOS adalah sistem operasi utama untuk platform permainan Steam Machine oleh Valve Corporation. Ini didasarkan pada Linux Debian. Ini dirilis bersamaan dengan dimulainya pengujian beta pengguna akhir dari Steam Machines pada Desember 2013.",
            "Debian adalah sistem operasi komputer yang tersusun dari paket-paket perangkat lunak yang dirilis sebagai perangkat lunak bebas dan terbuka dengan lisensi mayoritas GNU General Public License dan lisensi perangkat lunak bebas lainnya.",
            "Elementary OS merupakan sebuah distro linux berbasiskan Ubuntu. Distro ini menggunakan desktop manager-nya sendiri yang bernama Pantheon dan terintegrasi dengan aplikasi bawaan elementary OS lainnya, seperti Plank, peramban web Midori, dan Scratch.",
            "Ubermix adalah distro Linux cocok untuk anak-anak. Sistem operasi yang gratis dan dibangun khusus ini juga dilengkapi dengan dukungan fitur layar sentuh, yang menjadikannya pilihan tepat bagi anak-anak yang suka mengeksplorasi barang menggunakan tangan mereka. Ini mencoba menjadi alat yang hebat bagi siswa dan guru. Berkat instalasi 5 menit, 60 aplikasi pre-loaded gratis yang berguna, dan proses pemulihan 20 detik, Ubermix bertindak sebagai distro yang kuat bagi siswa dan guru.",
            "Tails atau Amnesic Incognito Live System adalah distribusi Linux berbasis Debian yang berfokus pada keamanan yang bertujuan untuk menjaga privasi dan anonimitas. Semua koneksi masuk dan keluarnya dipaksa melalui Tor, dan setiap dan semua koneksi non-anonim diblokir."
    };

    private static String[] Sejarah = {
            "Ubuntu pertama kali dirilis pada 20 Oktober 2004. Semenjak itu, Canonical telah merilis versi Ubuntu yang baru setiap 6 bulan sekali. Setiap rilis didukung selama 18 bulan untuk pembaruan sistem, keamanan, dan kesalahan (bug). Setiap 2 tahun sekali (versi xx.04 dengan x angka genap) akan mendapatkan Long Term Support(LTS) selama 3 tahun untuk desktop dan 5 tahun untuk edisi server. Namun Ubuntu 12.04 yang dirilis pada April 2012 mendapatkan pembaruan sistem selama 5 tahun. Perpanjangan dukungan ini bertujuan untuk mengakomodasi bisnis dan pengguna IT yang bekerja pada siklus panjang dan pertimbangan biaya yang mahal untuk memperbarui sistem.",
            "Pertama kali dirilis pada tahun 2006 Linux Mint beredar dengan versi 1.0 Ada Versi ini masih dalam tahap beta. Pertama kali rilis Distro ini kurang mendapatkan perhatian, mungkin karena versi ini masih tahap beta dan tidak pernah dirilis dalam versi yang lebih stabil sehingga distro ini kurang dikenal. Dengan kemunculan Linux Mint 2.0 Barbara, selang beberapa bulan kemudian, Linux Mint mulai mendapat perhatian dari kalangan komunitas Linux. Denagn adanya komunitas tersendiri bagi pengguna Linux Mint Distro ini merilis beberapa versi yang boleh dikatakan sukses pada rentang 2006-2008. Sejak emunculan Barbara 5 versi Linux Mint telah dirilis antara lain versi 2.1 Bea, 2.2 Bianca, 3.0 Cassandra, 3.1 Celena dan 4.0 Daryna.",
            "Sejarah CentOS dimulai pada tahun 1993 oleh Bob Young membangun ACC Corporation, awalnya perusahaan ini menjual aksesories software Linux serta UNIX. Lalu pada tahun 1994 Marc Ewing membuat OS Linux sendiri, yang diberi nama Red Hat Linux. Akhirnya Ewing meluncurkannya produknya pada Oktober tahun yang sama, yang dikenal dengan rilis Halloween. Bisnisnya pun semakin besar ketika Bob Young membeli bisnis Ewing pada tahun 1995, dan keduanya bergabung menjadi Red Hat Software, dengan Young menjabat sebagai CEO dari Red Hat Software.",
            "Proyek Ubuntu MATE didirikan oleh Martin Wimpress dan Alan Pope dan mulai menjadi turunan resmi dari Ubuntu, setelah rilis pertama Ubuntu 14.10; sebuah 14.04 LTS release segera diikuti. Pada Februari 2015, Ubuntu MATE memperoleh status resmi sebagai Ubuntu flavour dari Canonical Ltd. sesuai rilis 15.04 Beta 1. Selain untuk arsitektur IA-32 dan x86-64 yang merupakan awal platform yang didukung, Ubuntu MATE ini juga mendukung PowerPC dan ARMv7 (pada Raspberry Pi 2 dan 3). Pada bulan April 2015, Ubuntu MATE mengumumkan kemitraan dengan reseller komputer dari Inggris, Entroware, memungkinkan konsumen Entroware untuk membeli komputer desktop dan laptop dengan Ubuntu MATE terinstal dengan dukungan penuh. Beberapa penawaran perangkat keras lainnya diumumkan kemudian.",
            "Kali Linux sendiri  untuk saat ini sedang menjadi buah bibir di kalangan para pecinta linux diseluruh dunia.Karena distro ini dulunya adalah distro Backtrack yang sangat mendunia itu. Para pengembang backtrackpun memutuskan untuk mengganti nama distronya menjadi Kali Linux sekitar pertengahan maret 2013 di versi terbarunya ini untuk memfokuskan Kali Linux sebagai distro berbasis industri untuk percobaan penetrasi (Penetration Testing). Disamping meneruskan kehadiran distro Backtrack dengan nama barunya, Kali Linux yang dikembangkan secara diam-diam ini,Kali Linux juga telah melakukan perombakan dan menata ulang kembali strukturnya,termasuk mengganti distro Linux yang digunakan sebagai landasannya. Jadi Kali Linux saat ini akan dijadikan sebagai standarisasi distro Linux yang digunakan untuk sebuah percobaan penetrasi (Penetration Testing).",
            "SteamOS dirancang terutama untuk bermain video game jauh dari PC (seperti dari sofa di ruang tamu seseorang) dengan memberikan pengalaman seperti konsol menggunakan perangkat keras PC generik yang dapat terhubung langsung ke televisi. Itu dapat menjalankan game asli yang telah dikembangkan untuk Linux dan dibeli dari toko Steam . Pengguna juga dapat melakukan streaming game dari komputer Windows, Mac atau Linux ke satu yang menjalankan SteamOS, dan itu menggabungkan pembagian dan pembatasan keluarga yang sama dengan Steam di desktop. Valve mengklaim bahwa ia \"mencapai peningkatan kinerja yang signifikan dalam pemrosesan grafis\" melalui SteamOS. Sistem operasi ini bersifat open source , memungkinkan pengguna untuk membangun atau mengadaptasi kode sumber , meskipun klien Steam sebenarnya ditutup.",
            "Debian pertama kali diperkenalkan oleh Ian Murdock, seorang mahasiswa dari Universitas Purdue, Amerika Serikat, pada tanggal 16 Agustus 1993. Nama Debian berasal dari kombinasi nama Ian dengan mantan-kekasihnya Debra Lynn: Deb dan Ian. Proyek Debian tumbuh lambat pada awalnya dan merilis versi 0.9x pada tahun 1994 dan 1995. Pengalihan arsitektur ke selain i386 dimulai pada tahun 1995. Versi 1.x dimulai tahun 1996. Ditahun 1996, Bruce Perens menggantikan Ian Murdoch sebagai Pemimpin Proyek. Dalam tahun yang sama pengembang debian Ean Schuessler, berinisiatif untuk membentuk Debian Social Contract dan Debian Free Software Guidelines, memberikan standar dasar komitmen untuk pengembangan distribusi debian. Dia juga membentuk organisasi “Software in Public Interest” untuk menaungi debian secara legal dan hukum.\n" +
                    "\n" +
                    "Di akhir tahun 2000, proyek debian melakukan perubahan dalam archive dan managemen rilis. Serta pada tahun yang sama para pengembang memulai konferensi dan workshop tahunan “debconf”.",
            "Distro ini pada awalnya bermula dari sepaket tema dan aplikasi-aplikasi yang ditujukan untuk Ubuntu, namun kemudian berubah fungsi menjadi sebuah distro linux tersendiri.Sebagai turunan dari Ubuntu, distro ini kompatibel dengan repositori dan paket-paket milik Ubuntu. Distro ini juga menggunakan software center milik Ubuntu untuk menangani pemasangan dan pencopotan perangkat lunak, meskipun software center elemetary sendiri sedang dalam pengerjaan.Tampilan antar mukanya dibuat agar terlihat intuitif bagi pengguna-pengguna baru tanpa menggunakan banyak sumber daya dan dengan desain yang serupa dengan sistem operasi OS X dari Apple.\n" +
                    "\n" +
                    "Rilis versi stabil pertama dari elementary OS adalah “Jupiter”,diluncurkan pada Maret 2011 dan berbasis Ubutu 10.10. Sejak Oktober 2012, versi ini tidak lagi didukung dan berarti juga tidak lagi bisa diunduh di situs resmi elementary OS\n" +
                    "\n" +
                    "Pada bulan November 2012, versi beta pertama dari elementary OS bernama kode “Luna” dirilis, yang menggunakan Ubuntu 12.04 LTS sebagai dasarnya.Versi beta kedua dari “Luna” dirilis pada tanggal 6 May 2013, melakukan lebih dari perbaikan atas 300 bug dan beberapa perubahan seperti peningkatan dukungan untuk berbagai localization, dukungan layar ganda dan pembaruan beberapa aplikasi.\n" +
                    "\n" +
                    "Pada tanggal 7 Agustus 2013, jam hitung mundur muncul pada situs resmi elementary OS yang berakhir pada 10 Agustus 2013.Versi stabil kedua dari elementary OS, bernama “Luna”, diluncurkan pada 10 Agustus 2013, dengan perombakan total dan desain ulang situs resminya",
            "Ubermix adalah sistem operasi berbasis Linux yang serba gratis, dibangun khusus yang dirancang dari awal dengan kebutuhan akan pendidikan. Dibangun oleh para pendidik dengan tujuan pemberdayaan siswa dan guru, ubermix menghilangkan semua kerumitan perangkat siswa dengan menjadikannya dapat diandalkan dan mudah digunakan seperti ponsel, tanpa mengorbankan kekuatan dan kemampuan sistem operasi penuh. Dengan tombol putar, instalasi 5 menit, mekanisme pemulihan cepat 20 detik, dan lebih dari 60 aplikasi gratis pra-instal, ubermix mengubah perangkat keras apa pun yang Anda miliki menjadi perangkat yang kuat untuk belajar.",
            "Tails atau Amnesic Incognito Live System adalah distribusi Linux berbasis Debian yang berfokus pada keamanan yang bertujuan untuk menjaga privasi dan anonimitas . Semua koneksi masuk dan keluarnya dipaksa melalui Tor , dan semua dan semua koneksi non-anonim diblokir. Sistem ini dirancang untuk di-boot sebagai DVD langsung atau USB langsung , dan tidak akan meninggalkan jejak digital pada mesin kecuali diminta secara eksplisit untuk melakukannya. Proyek Tor telah memberikan dukungan keuangan untuk pengembangannya. Menurut Proyek Whonix , dibandingkan dengan perangkat lunak atau platform yang berfokus anonimitas lainnya, \"Tails lebih cocok untuk pengguna berisiko tinggi yang menghadapi pengawasan agresif dan bertarget.\""

    };

    private static String[] Rilis = {
            "Rilis pada tahun 2004",
            "Rilis pada tahun 2006",
            "Rilis pada tahun 2003",
            "Rilis pada tahun 1993",
            "Rilis pada tahun 2015",
            "Rilis pada tahun 2013",
            "Rilis pada tahun 2013",
            "Rilis pada tahun 1993",
            "Rilis pada tahun 2012",
            "Rilis pada tahun 2009"
    };

    private static int[] linuxImages = {
            R.drawable.ubuntu,
            R.drawable.mint,
            R.drawable.centos,
            R.drawable.mate,
            R.drawable.kalilinux,
            R.drawable.steam,
            R.drawable.debian,
            R.drawable.elementary,
            R.drawable.ubermix,
            R.drawable.tails
    };

    static ArrayList<Linux> getListData(){
        ArrayList<Linux> list = new ArrayList<>();
        for(int position = 0; position < linuxNames.length; position++){
            Linux linux = new Linux();
            linux.setName(linuxNames[position]);
            linux.setRilis(Rilis[position]);
            linux.setDetail(linuxDetails[position]);
            linux.setPhoto(linuxImages[position]);
            linux.setSejarah(Sejarah[position]);
            list.add(linux);
        }
        return list;
    }
}