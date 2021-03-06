package glimpse.core

object ArrayUtils {

    internal fun generateEmptyTensor(batches: Int, channels: Int, rows: Int, cols: Int, defaultValue: Float = 0f) =
        Array(batches) {
            Array(channels) {
                Array(rows) {
                    FloatArray(cols) {
                        defaultValue
                    }
                }
            }
        }

}