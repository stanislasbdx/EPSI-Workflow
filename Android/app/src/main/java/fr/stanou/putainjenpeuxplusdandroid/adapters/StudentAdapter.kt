package fr.stanou.putainjenpeuxplusdandroid.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import fr.stanou.putainjenpeuxplusdandroid.R
import fr.stanou.putainjenpeuxplusdandroid.pojo.Student

class StudentAdapter(val students: ArrayList<Student>) :
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cell_student, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = students.get(position)
        holder.textViewName.text = student.name
        holder.textViewEmail.text = student.email
        holder.textViewCity.text = student.city
        holder.textViewZipcode.text = student.zipCode
        holder.textViewPhone.text = student.phone
        Picasso.get().load(student.imgUrl).into(holder.imageViewStudent)
        holder.contentLayout.setOnClickListener(View.OnClickListener {
            Toast.makeText(holder.contentLayout.context, student.name, Toast.LENGTH_SHORT).show()
        })
    }

    override fun getItemCount(): Int {
        return students.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName = view.findViewById<TextView>(R.id.textViewName)
        val textViewEmail = view.findViewById<TextView>(R.id.textViewEmail)
        val textViewCity = view.findViewById<TextView>(R.id.textViewCity)
        val textViewZipcode = view.findViewById<TextView>(R.id.textViewZipcode)
        val textViewPhone = view.findViewById<TextView>(R.id.textViewPhone)
        val imageViewStudent = view.findViewById<ImageView>(R.id.imageViewStudent)
        val contentLayout = view.findViewById<LinearLayout>(R.id.contentLayout)
    }
}

