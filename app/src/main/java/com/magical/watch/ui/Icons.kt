package com.magical.watch.ui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.unit.dp


// My Watch
val watch: ImageVector
    get() {
        if (_watch != null) return _watch!!

        _watch = ImageVector.Builder(
            name = "frame",
            defaultWidth = 21.dp,
            defaultHeight = 23.dp,
            viewportWidth = 21f,
            viewportHeight = 23f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFFFFA72C)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 5.76855f)
                    verticalLineTo(16.7793f)
                    curveTo(0f, 17.2376f, 0.107422f, 17.653f, 0.322266f, 18.0254f)
                    curveTo(0.544271f, 18.3906f, 0.83431f, 18.6878f, 1.19238f, 18.917f)
                    curveTo(1.55046f, 19.139f, 1.94434f, 19.2607f, 2.37402f, 19.2822f)
                    curveTo(2.20215f, 19.0674f, 2.07324f, 18.8597f, 1.9873f, 18.6592f)
                    curveTo(1.90137f, 18.4587f, 1.8584f, 18.2617f, 1.8584f, 18.0684f)
                    curveTo(1.8584f, 17.7676f, 1.93717f, 17.499f, 2.09473f, 17.2627f)
                    curveTo(2.25944f, 17.0264f, 2.4707f, 16.8366f, 2.72852f, 16.6934f)
                    curveTo(2.98633f, 16.5501f, 3.25846f, 16.4785f, 3.54492f, 16.4785f)
                    curveTo(3.76693f, 16.4785f, 3.96029f, 16.5143f, 4.125f, 16.5859f)
                    curveTo(4.28971f, 16.6576f, 4.4401f, 16.7614f, 4.57617f, 16.8975f)
                    curveTo(4.7194f, 17.0264f, 4.86621f, 17.1839f, 5.0166f, 17.3701f)
                    curveTo(5.03809f, 17.277f, 5.05241f, 17.1839f, 5.05957f, 17.0908f)
                    curveTo(5.07389f, 16.9906f, 5.08105f, 16.8867f, 5.08105f, 16.7793f)
                    verticalLineTo(5.76855f)
                    curveTo(5.08105f, 5.58952f, 5.05957f, 5.39616f, 5.0166f, 5.18848f)
                    curveTo(4.80176f, 5.44629f, 4.59049f, 5.65755f, 4.38281f, 5.82227f)
                    curveTo(4.17513f, 5.98698f, 3.89941f, 6.06934f, 3.55566f, 6.06934f)
                    curveTo(3.26204f, 6.06934f, 2.98633f, 6.0013f, 2.72852f, 5.86523f)
                    curveTo(2.4707f, 5.72201f, 2.25944f, 5.53223f, 2.09473f, 5.2959f)
                    curveTo(1.93717f, 5.05241f, 1.8584f, 4.78385f, 1.8584f, 4.49023f)
                    curveTo(1.8584f, 4.30404f, 1.90137f, 4.11068f, 1.9873f, 3.91016f)
                    curveTo(2.07324f, 3.70247f, 2.20215f, 3.49121f, 2.37402f, 3.27637f)
                    curveTo(1.94434f, 3.29785f, 1.55046f, 3.42318f, 1.19238f, 3.65234f)
                    curveTo(0.83431f, 3.87435f, 0.544271f, 4.17155f, 0.322266f, 4.54395f)
                    curveTo(0.107422f, 4.90918f, 0f, 5.31738f, 0f, 5.76855f)
                    close()
                    moveTo(3.69531f, 10.0439f)
                    curveTo(3.38021f, 10.3662f, 2.99707f, 10.5273f, 2.5459f, 10.5273f)
                    curveTo(2.09473f, 10.5273f, 1.70801f, 10.3662f, 1.38574f, 10.0439f)
                    curveTo(1.06348f, 9.72168f, 0.902344f, 9.33496f, 0.902344f, 8.88379f)
                    curveTo(0.902344f, 8.43262f, 1.06348f, 8.04948f, 1.38574f, 7.73438f)
                    curveTo(1.70801f, 7.41211f, 2.09473f, 7.25098f, 2.5459f, 7.25098f)
                    curveTo(2.99707f, 7.25098f, 3.38021f, 7.41211f, 3.69531f, 7.73438f)
                    curveTo(4.01758f, 8.04948f, 4.17871f, 8.43262f, 4.17871f, 8.88379f)
                    curveTo(4.17871f, 9.33496f, 4.01758f, 9.72168f, 3.69531f, 10.0439f)
                    close()
                    moveTo(1.91211f, 9.51758f)
                    curveTo(2.09115f, 9.68945f, 2.30241f, 9.77539f, 2.5459f, 9.77539f)
                    curveTo(2.78939f, 9.77539f, 2.99707f, 9.68945f, 3.16895f, 9.51758f)
                    curveTo(3.34082f, 9.33854f, 3.42676f, 9.12728f, 3.42676f, 8.88379f)
                    curveTo(3.42676f, 8.6403f, 3.34082f, 8.43262f, 3.16895f, 8.26074f)
                    curveTo(2.99707f, 8.08887f, 2.78939f, 8.00293f, 2.5459f, 8.00293f)
                    curveTo(2.30241f, 8.00293f, 2.09115f, 8.08887f, 1.91211f, 8.26074f)
                    curveTo(1.74023f, 8.43262f, 1.6543f, 8.6403f, 1.6543f, 8.88379f)
                    curveTo(1.6543f, 9.12728f, 1.74023f, 9.33854f, 1.91211f, 9.51758f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFFA36125))
                ) {
                    moveTo(6.32715f, 21.5273f)
                    curveTo(7.66634f, 22.2148f, 9.09863f, 22.5586f, 10.624f, 22.5586f)
                    curveTo(12.0492f, 22.5586f, 13.3812f, 22.265f, 14.6201f, 21.6777f)
                    curveTo(15.859f, 21.0977f, 16.9476f, 20.2884f, 17.8857f, 19.25f)
                    curveTo(18.8311f, 18.2188f, 19.5687f, 17.0228f, 20.0986f, 15.6621f)
                    curveTo(20.6357f, 14.2943f, 20.9043f, 12.8333f, 20.9043f, 11.2793f)
                    curveTo(20.9043f, 9.7181f, 20.6357f, 8.25716f, 20.0986f, 6.89648f)
                    curveTo(19.5687f, 5.53581f, 18.8311f, 4.33984f, 17.8857f, 3.30859f)
                    curveTo(16.9476f, 2.27018f, 15.859f, 1.46094f, 14.6201f, 0.880859f)
                    curveTo(13.3812f, 0.29362f, 12.0492f, 0f, 10.624f, 0f)
                    curveTo(9.09863f, 0f, 7.66634f, 0.34375f, 6.32715f, 1.03125f)
                    curveTo(4.99512f, 1.71159f, 3.85645f, 2.64616f, 2.91113f, 3.83496f)
                    curveTo(2.7321f, 4.05697f, 2.64258f, 4.28255f, 2.64258f, 4.51172f)
                    curveTo(2.64258f, 4.74089f, 2.7321f, 4.93066f, 2.91113f, 5.08105f)
                    curveTo(3.09017f, 5.22428f, 3.29069f, 5.2959f, 3.5127f, 5.2959f)
                    curveTo(3.80632f, 5.2959f, 4.04622f, 5.17773f, 4.23242f, 4.94141f)
                    curveTo(5.02018f, 3.94596f, 5.96908f, 3.16178f, 7.0791f, 2.58887f)
                    curveTo(8.18913f, 2.01595f, 9.37077f, 1.72949f, 10.624f, 1.72949f)
                    curveTo(11.8057f, 1.72949f, 12.9121f, 1.97656f, 13.9434f, 2.4707f)
                    curveTo(14.9746f, 2.96484f, 15.8805f, 3.65234f, 16.6611f, 4.5332f)
                    curveTo(17.4489f, 5.4069f, 18.0612f, 6.42025f, 18.498f, 7.57324f)
                    curveTo(18.9421f, 8.72624f, 19.1641f, 9.96159f, 19.1641f, 11.2793f)
                    curveTo(19.1641f, 12.597f, 18.9421f, 13.8324f, 18.498f, 14.9854f)
                    curveTo(18.0612f, 16.1383f, 17.4489f, 17.1553f, 16.6611f, 18.0361f)
                    curveTo(15.8805f, 18.9098f, 14.9746f, 19.5938f, 13.9434f, 20.0879f)
                    curveTo(12.9121f, 20.582f, 11.8057f, 20.8291f, 10.624f, 20.8291f)
                    curveTo(9.37077f, 20.8291f, 8.18913f, 20.5426f, 7.0791f, 19.9697f)
                    curveTo(5.96908f, 19.3968f, 5.02018f, 18.6126f, 4.23242f, 17.6172f)
                    curveTo(4.04622f, 17.3809f, 3.80632f, 17.2627f, 3.5127f, 17.2627f)
                    curveTo(3.29069f, 17.2627f, 3.09017f, 17.3379f, 2.91113f, 17.4883f)
                    curveTo(2.7321f, 17.6315f, 2.64258f, 17.8177f, 2.64258f, 18.0469f)
                    curveTo(2.64258f, 18.276f, 2.7321f, 18.5016f, 2.91113f, 18.7236f)
                    curveTo(3.85645f, 19.9124f, 4.99512f, 20.847f, 6.32715f, 21.5273f)
                    close()
                }
            }
        }.build()

        return _watch!!
    }

private var _watch: ImageVector? = null

// Face Gallery
val watchface: ImageVector
    get() {
        if (_watchface != null) return _watchface!!

        _watchface = ImageVector.Builder(
            name = "watchface",
            defaultWidth = 16.dp,
            defaultHeight = 23.dp,
            viewportWidth = 16f,
            viewportHeight = 23f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFA72C))
            ) {
                moveTo(0f, 15.8447f)
                verticalLineTo(7.1543f)
                curveTo(0f, 6.31641f, 0.161133f, 5.59668f, 0.483398f, 4.99512f)
                curveTo(0.805664f, 4.38639f, 1.26758f, 3.9209f, 1.86914f, 3.59863f)
                curveTo(2.16992f, 3.44824f, 2.40983f, 3.26204f, 2.58887f, 3.04004f)
                curveTo(2.77507f, 2.81803f, 2.91829f, 2.53158f, 3.01855f, 2.18066f)
                lineTo(3.3623f, 1.02051f)
                curveTo(3.56283f, 0.340169f, 4.0319f, 0f, 4.76953f, 0f)
                horizontalLineTo(9.73242f)
                curveTo(10.4772f, 0f, 10.9427f, 0.340169f, 11.1289f, 1.02051f)
                lineTo(11.4834f, 2.18066f)
                curveTo(11.5908f, 2.53158f, 11.734f, 2.81803f, 11.9131f, 3.04004f)
                curveTo(12.0993f, 3.25488f, 12.3392f, 3.44108f, 12.6328f, 3.59863f)
                curveTo(13.2415f, 3.93522f, 13.7035f, 4.4043f, 14.0186f, 5.00586f)
                curveTo(14.3408f, 5.60742f, 14.502f, 6.32357f, 14.502f, 7.1543f)
                verticalLineTo(15.8447f)
                curveTo(14.502f, 16.6755f, 14.3408f, 17.3916f, 14.0186f, 17.9932f)
                curveTo(13.7035f, 18.5947f, 13.2415f, 19.0638f, 12.6328f, 19.4004f)
                curveTo(12.3392f, 19.5579f, 12.0993f, 19.7441f, 11.9131f, 19.959f)
                curveTo(11.734f, 20.181f, 11.5908f, 20.471f, 11.4834f, 20.8291f)
                lineTo(11.1289f, 21.9785f)
                curveTo(10.9284f, 22.6589f, 10.4629f, 22.999f, 9.73242f, 22.999f)
                horizontalLineTo(4.76953f)
                curveTo(4.0319f, 22.999f, 3.56283f, 22.6589f, 3.3623f, 21.9785f)
                lineTo(3.01855f, 20.8291f)
                curveTo(2.91113f, 20.471f, 2.76432f, 20.181f, 2.57812f, 19.959f)
                curveTo(2.39909f, 19.7441f, 2.16276f, 19.5579f, 1.86914f, 19.4004f)
                curveTo(1.26042f, 19.0638f, 0.794922f, 18.5947f, 0.472656f, 17.9932f)
                curveTo(0.157552f, 17.3916f, 0f, 16.6755f, 0f, 15.8447f)
                close()
                moveTo(1.56836f, 15.6191f)
                curveTo(1.56836f, 16.4141f, 1.78678f, 17.0407f, 2.22363f, 17.499f)
                curveTo(2.66764f, 17.9502f, 3.28353f, 18.1758f, 4.07129f, 18.1758f)
                horizontalLineTo(10.4307f)
                curveTo(11.2184f, 18.1758f, 11.8307f, 17.9502f, 12.2676f, 17.499f)
                curveTo(12.7116f, 17.0407f, 12.9336f, 16.4141f, 12.9336f, 15.6191f)
                verticalLineTo(7.39062f)
                curveTo(12.9336f, 6.58854f, 12.7116f, 5.96191f, 12.2676f, 5.51074f)
                curveTo(11.8307f, 5.05241f, 11.2184f, 4.82324f, 10.4307f, 4.82324f)
                horizontalLineTo(4.07129f)
                curveTo(3.28353f, 4.82324f, 2.66764f, 5.05241f, 2.22363f, 5.51074f)
                curveTo(1.78678f, 5.96191f, 1.56836f, 6.58854f, 1.56836f, 7.39062f)
                verticalLineTo(15.6191f)
                close()
                moveTo(14.2656f, 10.7422f)
                verticalLineTo(7.31543f)
                horizontalLineTo(14.6523f)
                curveTo(14.9316f, 7.31543f, 15.1536f, 7.40495f, 15.3184f, 7.58398f)
                curveTo(15.4902f, 7.75586f, 15.5762f, 7.99577f, 15.5762f, 8.30371f)
                verticalLineTo(9.75391f)
                curveTo(15.5762f, 10.0618f, 15.4902f, 10.3053f, 15.3184f, 10.4844f)
                curveTo(15.1536f, 10.6562f, 14.9316f, 10.7422f, 14.6523f, 10.7422f)
                horizontalLineTo(14.2656f)
                close()
                moveTo(4.09277f, 9.2168f)
                curveTo(4.22168f, 9.06641f, 4.38281f, 8.98405f, 4.57617f, 8.96973f)
                curveTo(4.77669f, 8.94824f, 4.95215f, 8.99837f, 5.10254f, 9.12012f)
                lineTo(7.04688f, 10.7637f)
                lineTo(10.4736f, 7.78809f)
                curveTo(10.624f, 7.65202f, 10.7959f, 7.58398f, 10.9893f, 7.58398f)
                curveTo(11.1898f, 7.58398f, 11.3581f, 7.65202f, 11.4941f, 7.78809f)
                curveTo(11.6374f, 7.93848f, 11.709f, 8.11751f, 11.709f, 8.3252f)
                curveTo(11.709f, 8.52572f, 11.6338f, 8.69043f, 11.4834f, 8.81934f)
                lineTo(7.73438f, 12.0957f)
                curveTo(7.51237f, 12.2891f, 7.29036f, 12.3857f, 7.06836f, 12.3857f)
                curveTo(6.84635f, 12.3857f, 6.62077f, 12.2891f, 6.3916f, 12.0957f)
                lineTo(4.18945f, 10.248f)
                curveTo(4.0319f, 10.112f, 3.94238f, 9.94368f, 3.9209f, 9.74316f)
                curveTo(3.90658f, 9.54264f, 3.96387f, 9.36719f, 4.09277f, 9.2168f)
                close()
            }
        }.build()

        return _watchface!!
    }

private var _watchface: ImageVector? = null


// Discover
val compass: ImageVector
    get() {
        if (_compass != null) return _compass!!

        _compass = ImageVector.Builder(
            name = "compass",
            defaultWidth = 22.dp,
            defaultHeight = 22.dp,
            viewportWidth = 22f,
            viewportHeight = 22f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFA72C))
            ) {
                moveTo(10.957f, 21.9141f)
                curveTo(9.44596f, 21.9141f, 8.02799f, 21.6276f, 6.70312f, 21.0547f)
                curveTo(5.37826f, 20.4889f, 4.21452f, 19.7048f, 3.21191f, 18.7021f)
                curveTo(2.20931f, 17.6924f, 1.42155f, 16.5286f, 0.848633f, 15.2109f)
                curveTo(0.282878f, 13.8861f, 0f, 12.4681f, 0f, 10.957f)
                curveTo(0f, 9.44596f, 0.282878f, 8.02799f, 0.848633f, 6.70312f)
                curveTo(1.42155f, 5.37826f, 2.20931f, 4.21452f, 3.21191f, 3.21191f)
                curveTo(4.21452f, 2.20931f, 5.37826f, 1.42513f, 6.70312f, 0.859375f)
                curveTo(8.02799f, 0.286458f, 9.44596f, 0f, 10.957f, 0f)
                curveTo(12.4681f, 0f, 13.8861f, 0.286458f, 15.2109f, 0.859375f)
                curveTo(16.5358f, 1.42513f, 17.6995f, 2.20931f, 18.7021f, 3.21191f)
                curveTo(19.7048f, 4.21452f, 20.4889f, 5.37826f, 21.0547f, 6.70312f)
                curveTo(21.6276f, 8.02799f, 21.9141f, 9.44596f, 21.9141f, 10.957f)
                curveTo(21.9141f, 12.4681f, 21.6276f, 13.8861f, 21.0547f, 15.2109f)
                curveTo(20.4889f, 16.5286f, 19.7048f, 17.6924f, 18.7021f, 18.7021f)
                curveTo(17.6995f, 19.7048f, 16.5358f, 20.4889f, 15.2109f, 21.0547f)
                curveTo(13.8861f, 21.6276f, 12.4681f, 21.9141f, 10.957f, 21.9141f)
                close()
                moveTo(6.32715f, 16.5537f)
                lineTo(12.6865f, 13.4385f)
                curveTo(13.0231f, 13.2809f, 13.2773f, 13.0267f, 13.4492f, 12.6758f)
                lineTo(16.543f, 6.32715f)
                curveTo(16.6647f, 6.0765f, 16.6934f, 5.85807f, 16.6289f, 5.67188f)
                curveTo(16.5716f, 5.47852f, 16.4463f, 5.34961f, 16.2529f, 5.28516f)
                curveTo(16.0667f, 5.2207f, 15.8411f, 5.24935f, 15.5762f, 5.37109f)
                lineTo(9.24902f, 8.46484f)
                curveTo(9.07715f, 8.54362f, 8.92676f, 8.64746f, 8.79785f, 8.77637f)
                curveTo(8.67611f, 8.89811f, 8.56868f, 9.05208f, 8.47559f, 9.23828f)
                lineTo(5.37109f, 15.5977f)
                curveTo(5.25651f, 15.8411f, 5.23145f, 16.056f, 5.2959f, 16.2422f)
                curveTo(5.36035f, 16.4284f, 5.48568f, 16.5573f, 5.67188f, 16.6289f)
                curveTo(5.86523f, 16.6934f, 6.08366f, 16.6683f, 6.32715f, 16.5537f)
                close()
                moveTo(10.9678f, 12.332f)
                curveTo(10.5954f, 12.332f, 10.2731f, 12.1995f, 10.001f, 11.9346f)
                curveTo(9.736f, 11.6624f, 9.60352f, 11.3402f, 9.60352f, 10.9678f)
                curveTo(9.60352f, 10.5954f, 9.736f, 10.2767f, 10.001f, 10.0117f)
                curveTo(10.2731f, 9.74674f, 10.5954f, 9.61426f, 10.9678f, 9.61426f)
                curveTo(11.3402f, 9.61426f, 11.6589f, 9.74674f, 11.9238f, 10.0117f)
                curveTo(12.1888f, 10.2767f, 12.3213f, 10.5954f, 12.3213f, 10.9678f)
                curveTo(12.3213f, 11.3402f, 12.1888f, 11.6624f, 11.9238f, 11.9346f)
                curveTo(11.6589f, 12.1995f, 11.3402f, 12.332f, 10.9678f, 12.332f)
                close()
            }
        }.build()

        return _compass!!
    }

private var _compass: ImageVector? = null


