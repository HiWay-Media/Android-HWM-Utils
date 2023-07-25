package src.main.java.media.hiway.utils.uxclasses

import android.content.res.Resources
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.Interpolator



/**
 *   Created by Allan Nava on 25/07/2023.
 *   Updated by Allan Nava on 25/07/2023.
 *
 **/

/*
class LinePagerIndicatorDecoration(itemCounts: Int) : RecyclerView.ItemDecoration() {
    private val colorActive = -0x1
    private val colorInactive = 0x663C4B56

    /**
     * Height of the space the indicator takes up at the bottom of the view.
     */
    private val mIndicatorHeight = (DP * 20).toInt()

    /**
     * Indicator stroke width.
     */
    private val mIndicatorStrokeWidth = DP * 2

    /**
     * Indicator width.
     */
    private val mIndicatorItemLength = DP * 24

    /**
     * Padding between indicators.
     */
    private val mIndicatorItemPadding = DP * 6

    /**
     * Some more natural animation interpolation
     */
    private val mInterpolator: Interpolator = AccelerateDecelerateInterpolator()
    private val mPaint = Paint()
    private val itemCountDefault: Int

    init {
        mPaint.strokeCap = Paint.Cap.ROUND
        mPaint.strokeWidth = mIndicatorStrokeWidth
        mPaint.style = Paint.Style.FILL
        mPaint.isAntiAlias = true
        itemCountDefault = itemCounts
    }

    fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State?) {
        super.onDrawOver(c, parent, state)
        var itemCount: Int = parent.getAdapter().getItemCount()
        if (itemCountDefault != 0) {
            itemCount = itemCountDefault
        }
        //Log.i("TAG", "itemCount " + itemCount);
        // center horizontally, calculate width and subtract half from center
        val totalLength = mIndicatorItemLength * itemCount
        val paddingBetweenItems = Math.max(0, itemCount - 1) * mIndicatorItemPadding
        val indicatorTotalWidth = totalLength + paddingBetweenItems
        //float indicatorStartX = (parent.getWidth() - indicatorTotalWidth) / 2F;
        val indicatorStartX = 45f

        // center vertically in the allotted space
        val indicatorPosY: Float = parent.getHeight() - mIndicatorHeight / 2f
        drawInactiveIndicators(c, indicatorStartX, indicatorPosY, itemCount)

        // find active page (which should be highlighted)
        val layoutManager: LinearLayoutManager = parent.getLayoutManager() as LinearLayoutManager
        val activePosition: Int = layoutManager.findFirstVisibleItemPosition()
        if (activePosition == RecyclerView.NO_POSITION) {
            return
        }

        // find offset of active page (if the user is scrolling)
        val activeChild: View = layoutManager.findViewByPosition(activePosition)
        val left = activeChild.left
        val width = activeChild.width

        // on swipe the active item will be positioned from [-width, 0]
        // interpolate offset for smooth animation
        val progress = mInterpolator.getInterpolation(left * -1 / width.toFloat())
        drawHighlights(c, indicatorStartX, indicatorPosY, activePosition, progress, itemCount)
    }

    private fun drawInactiveIndicators(
        c: Canvas,
        indicatorStartX: Float,
        indicatorPosY: Float,
        itemCount: Int,
    ) {
        mPaint.color = colorInactive
        // width of item indicator including padding
        val itemWidth = mIndicatorItemLength + mIndicatorItemPadding
        var start = indicatorStartX
        for (i in 0 until itemCount) {
            // only border colored
            mPaint.color = colorInactive
            mPaint.strokeWidth = 6f
            mPaint.style = Paint.Style.STROKE
            // c.drawCircle(start, indicatorPosY, (float) (mIndicatorItemLength/(1.4)), mPaint);
            //
            // draw the line for every item
            //c.drawCircle(start, indicatorPosY, (float) (mIndicatorItemLength/(1.4)), mPaint);
            c.drawLine(start, indicatorPosY, start + mIndicatorItemLength, indicatorPosY, mPaint)
            start += itemWidth
        }
    }

    private fun drawHighlights(
        c: Canvas, indicatorStartX: Float, indicatorPosY: Float,
        highlightPosition: Int, progress: Float, itemCount: Int,
    ) {
        mPaint.color = colorActive

        // width of item indicator including padding
        val itemWidth = mIndicatorItemLength + mIndicatorItemPadding
        // fill mPaint
        mPaint.strokeCap = Paint.Cap.ROUND
        mPaint.strokeWidth = mIndicatorStrokeWidth
        mPaint.style = Paint.Style.FILL
        mPaint.isAntiAlias = true
        if (progress == 0f) {
            // no swipe, draw a normal indicator
            val highlightStart = indicatorStartX + itemWidth * highlightPosition
            c.drawLine(
                highlightStart,
                indicatorPosY,
                highlightStart + mIndicatorItemLength,
                indicatorPosY,
                mPaint
            )
        } else {
            var highlightStart = indicatorStartX + itemWidth * highlightPosition
            // calculate partial highlight
            val partialLength = mIndicatorItemLength * progress

            // draw the cut off highlight
            c.drawLine(
                highlightStart + partialLength,
                indicatorPosY,
                highlightStart + mIndicatorItemLength,
                indicatorPosY,
                mPaint
            )

            //c.drawCircle(highlightStart+partialLength, indicatorPosY, (float) (mIndicatorItemLength/(1.4)), mPaint);
            // draw the highlight overlapping to the next item as well
            if (highlightPosition < itemCount - 1) {
                highlightStart += itemWidth
                c.drawLine(
                    highlightStart,
                    indicatorPosY,
                    highlightStart + partialLength,
                    indicatorPosY,
                    mPaint
                )
                // c.drawCircle(highlightStart, indicatorPosY, (float) (mIndicatorItemLength/(1.4)), mPaint);
            }
        }
    }

    fun getItemOffsets(
        outRect: Rect,
        view: View?,
        parent: RecyclerView?,
        state: RecyclerView.State?,
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.bottom = mIndicatorHeight
    }

    companion object {
        private val DP = Resources.getSystem().displayMetrics.density
    }
}
*/