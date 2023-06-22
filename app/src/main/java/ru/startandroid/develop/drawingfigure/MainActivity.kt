package ru.startandroid.develop.drawingfigure

import android.content.Context
import android.graphics.*
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawView(this))
    }

//    internal class DrawView(context: Context?) : View(context) {
//        var p: Paint = Paint()
//        var rectf: RectF = RectF(700f, 100f, 800f, 150f)
//        var points: FloatArray =
//            floatArrayOf(100f, 50f, 150f, 100f, 150f, 200f, 50f, 200f, 50f, 100f)
//        var points1: FloatArray = floatArrayOf(
//            300f,
//            200f,
//            600f,
//            200f,
//            300f,
//            300f,
//            600f,
//            300f,
//            400f,
//            100f,
//            400f,
//            400f,
//            500f,
//            100f,
//            500f,
//            400f)
//
//        override fun onDraw(canvas: Canvas) {
//            canvas.drawARGB(80, 102, 204, 255)
//            p.color = Color.RED
//            p.strokeWidth = 10f
//
//            canvas.drawPoints(points, p)
//
//            canvas.drawLines(points1, p)
//
//            p.color = Color.GREEN
//
//            canvas.drawRoundRect(rectf, 20f, 20f, p)
//
//            rectf.offset(0f, 150f)
//            canvas.drawOval(rectf, p)
//
//            rectf.offsetTo(900f, 100f)
//            rectf.inset(0f, -25f)
//            canvas.drawArc(rectf, 90f, 270f, true, p)
//
//            rectf.offset(0f, 150f)
//            canvas.drawArc(rectf, 90f, 270f, false, p)
//
//            p.strokeWidth = 3f
//            canvas.drawLine(150f, 450f, 150f, 600f, p)
//
//
//            p.color = Color.BLUE
//
//            p.textSize = 30f
//            canvas.drawText("text left", 150f, 500f, p)
//
//            p.textAlign = Paint.Align.CENTER
//            canvas.drawText("text center", 150f, 525f, p)
//
//            p.textAlign = Paint.Align.RIGHT
//            canvas.drawText("text right", 150f, 550f, p)
//        }
//    }




//    internal class DrawView(context: Context?) : View(context) {
//    var p: Paint = Paint()
//    var rect: Rect = Rect()
//
//    override fun onDraw(canvas: Canvas) {
//        canvas.drawARGB(80, 102, 204, 255)
//
//        p.color = Color.RED
//        p.strokeWidth = 10f
//
//        canvas.drawPoint(50f, 50f, p)
//
//        canvas.drawLine(100f, 100f, 500f, 50f, p)
//
//        canvas.drawCircle(100f, 200f, 50f, p)
//
//        canvas.drawRect(200f, 150f, 400f, 200f, p)
//
//        rect.set(250, 300, 350, 500)
//
//        canvas.drawRect(rect, p)
//    }
//}



        internal class DrawView(context: Context?) : View(context) {
            var p: Paint = Paint()
            var rect: Rect = Rect(100, 200, 200, 300)
            var sb: StringBuilder = StringBuilder()

            override fun onDraw(canvas: Canvas) {
                canvas.drawARGB(80, 102, 204, 255)
                p.color = Color.BLUE
                p.strokeWidth = 10f
                p.textSize = 30f
                
                sb.setLength(0)
                sb.append("width = ").append(canvas.width)
                    .append(", height = ").append(canvas.height)
                canvas.drawText(sb.toString(), 100f, 100f, p)

                p.style = Paint.Style.FILL
                canvas.drawRect(rect, p)

                p.style = Paint.Style.STROKE
                rect.offset(150, 0)
                canvas.drawRect(rect, p)

                p.style = Paint.Style.FILL_AND_STROKE
                rect.offset(150, 0)
                canvas.drawRect(rect, p)
            }
        }
}