package com.efeyegitoglu.netflixclone

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_coming_soon.*


class ComingSoonFragment : Fragment() {

    private lateinit var comingSoonAdapter: ComingSoonAdapter
    private lateinit var soonRecycler: RecyclerView
    private val mList = ArrayList<ComingSoonMovies>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_coming_soon, container, false)

        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarComingSoon)
        toolbar.setLogo(R.drawable.netflix_logo)
        toolbar.title = ""
        setHasOptionsMenu(true)
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)




        soonRecycler = view.findViewById(R.id.soonRecycler)
        soonRecycler.setHasFixedSize(true)
        soonRecycler.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        val movieOne = ComingSoonMovies(
            1, R.raw.movie_one, "The Serpent", "2 Nisan", "Bir katili yakalamak için ne gerekir?\n" +
                    "\n" +
                    "Gerçek olaylardan esinlenen The Serpent, seri dolandırıcı Charles Sobhraj'ın (Altın Küre adayı Tahar Rahim) hikayesini ve onu adalete teslim etmek için yapılan olağanüstü girişimleri gözler önüne seriyor."
        )

        val movieTwo = ComingSoonMovies(2,R.raw.movie_two,"Thunder Force","9 Nisan","Süpervizörlerin sıradan olduğu bir dünyada, çocukluktan uzaklaşmış iki en iyi arkadaş, şehirlerini koruma gücü veren bir muamele planladıktan sonra yeniden bir araya gelir.")
        val movieThree = ComingSoonMovies(3,R.raw.movie_three,"Seaspiracy","24 Mart","Seaspiracy, küresel balıkçılık endüstrisini inceliyor, sürdürülebilir balıkçılık kavramlarına meydan okuyor ve insan eylemlerinin nasıl yaygın bir çevresel tahribata neden olduğunu gösteriyor.")
        val movieFour = ComingSoonMovies(4,R.raw.movie_four,"Moxie","3 Mayıs","Lisesindeki cinsiyetçi ve zehirli statükodan bıkmış 16 yaşındaki utangaç bir çocuk, annesinin asi geçmişinden ilham alır ve okul çapında öfke dolu bir devrimi ateşleyen bir dergi yayınlar. Jennifer Mathieu'nun romanından uyarlanmıştır. Yönetmen Amy Poehler.")

        mList.add(movieOne)
        mList.add(movieTwo)
        mList.add(movieThree)
        mList.add(movieFour)

        comingSoonAdapter = ComingSoonAdapter(context!!,mList)
        soonRecycler.adapter = comingSoonAdapter
        comingSoonAdapter.notifyDataSetChanged()

        return view
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.option_main_activity,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }


}