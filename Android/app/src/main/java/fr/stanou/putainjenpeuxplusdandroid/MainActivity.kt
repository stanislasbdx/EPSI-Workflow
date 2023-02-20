package fr.stanou.putainjenpeuxplusdandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import fr.stanou.putainjenpeuxplusdandroid.adapters.StudentAdapter
import fr.stanou.putainjenpeuxplusdandroid.pojo.Student
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    var data = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        val data = "{\n" +
                "  \"items\": [\n" +
                "    {\n" +
                "      \"picture_url\": \"https://www.numerama.com/content/uploads/2019/05/trou-noir-espace-univers-astronomie.jpg\",\n" +
                "      \"name\": \"Allan\",\n" +
                "      \"email\": \"allan@epsi.fr\",\n" +
                "      \"city\": \"Bordeaux\",\n" +
                "      \"phone\": \"0619191919\",\n" +
                "      \"zipcode\": \"33000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"picture_url\": \"https://helpx.adobe.com/content/dam/help/en/stock/how-to/visual-reverse-image-search/jcr_content/main-pars/image/visual-reverse-image-search-v2_intro.jpg\",\n" +
                "      \"name\": \"Arraud\",\n" +
                "      \"email\": \"arraud@epsi.fr\",\n" +
                "      \"city\": \"Bordeaux\",\n" +
                "      \"phone\": \"0619191919\",\n" +
                "      \"zipcode\": \"33000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"picture_url\": \"https://media.gettyimages.com/photos/colorful-powder-explosion-in-all-directions-in-a-nice-composition-picture-id890147976?s=2048x2048\",\n" +
                "      \"name\": \"Nicolas\",\n" +
                "      \"email\": \"nicolas@epsi.fr\",\n" +
                "      \"city\": \"Bordeaux\",\n" +
                "      \"phone\": \"0619191919\",\n" +
                "      \"zipcode\": \"33000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"picture_url\": \"https://interactive-examples.mdn.mozilla.net/media/examples/grapefruit-slice-332-332.jpg\",\n" +
                "      \"name\": \"Lilian\",\n" +
                "      \"email\": \"lilian@epsi.fr\",\n" +
                "      \"city\": \"Bordeaux\",\n" +
                "      \"phone\": \"0619191919\",\n" +
                "      \"zipcode\": \"33000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"picture_url\": \"https://cdn.futura-sciences.com/buildsv6/images/largeoriginal/2/3/1/2310c9171a_50157784_pia23441.jpg\",\n" +
                "      \"name\": \"Maxime\",\n" +
                "      \"email\": \"maxime@epsi.fr\",\n" +
                "      \"city\": \"Bordeaux\",\n" +
                "      \"phone\": \"0619191919\",\n" +
                "      \"zipcode\": \"33000\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"

        val students = arrayListOf<Student>()

        val jsStudents = JSONObject(data)
        val jsArrayStudent = jsStudents.getJSONArray("items")

        for (i in 0 until jsArrayStudent.length()) {
            val jsStudent = jsArrayStudent.getJSONObject(i)
            val student = Student(
                jsStudent.optString("name", "Not found"),
                jsStudent.optString("email", "Not found"),
                jsStudent.optString("phone", "Not found"),
                jsStudent.optString("city", "Not found"),
                jsStudent.optString("zipCode", "Not found"),
                jsStudent.optString("imgUrl", "https://picsum.photos/150")
            )
            students.add(student)
        }

        val recyclerviewStudents = findViewById<RecyclerView>(R.id.recyclerviewStudents)
        recyclerviewStudents.layoutManager = LinearLayoutManager(this)
        val studentAdapter = StudentAdapter(students)
        recyclerviewStudents.adapter = studentAdapter

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}