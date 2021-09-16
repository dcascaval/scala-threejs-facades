package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*

type Record[K,V] = js.native
type WebGLBuffer = js.native
type MediaStream = js.native
type ImageBitmap = js.native
type BufferSource = js.native
type MimeType = js.native
type WebGL2RenderingContext = js.native
type DOMPointReadOnly = js.native
type DOMHighResTimeStamp = js.native

@js.native
@JSGlobal("THREE.REVISION")
val REVISION: String = js.native

@js.native
trait MOUSE extends js.Object

@js.native
trait TOUCH extends js.Object

@js.native
trait CullFace extends js.Object
@js.native
@JSGlobal("THREE.CullFaceNone")
val CullFaceNone: CullFace = js.native
@js.native
@JSGlobal("THREE.CullFaceBack")
val CullFaceBack: CullFace = js.native
@js.native
@JSGlobal("THREE.CullFaceFront")
val CullFaceFront: CullFace = js.native
@js.native
@JSGlobal("THREE.CullFaceFrontBack")
val CullFaceFrontBack: CullFace = js.native

@js.native
trait ShadowMapType extends js.Object
@js.native
@JSGlobal("THREE.BasicShadowMap")
val BasicShadowMap: ShadowMapType = js.native
@js.native
@JSGlobal("THREE.PCFShadowMap")
val PCFShadowMap: ShadowMapType = js.native
@js.native
@JSGlobal("THREE.PCFSoftShadowMap")
val PCFSoftShadowMap: ShadowMapType = js.native
@js.native
@JSGlobal("THREE.VSMShadowMap")
val VSMShadowMap: ShadowMapType = js.native

@js.native
trait Side extends js.Object
@js.native
@JSGlobal("THREE.FrontSide")
val FrontSide: Side = js.native
@js.native
@JSGlobal("THREE.BackSide")
val BackSide: Side = js.native
@js.native
@JSGlobal("THREE.DoubleSide")
val DoubleSide: Side = js.native

@js.native
trait Shading extends js.Object
@js.native
@JSGlobal("THREE.FlatShading")
val FlatShading: Shading = js.native
@js.native
@JSGlobal("THREE.SmoothShading")
val SmoothShading: Shading = js.native

@js.native
trait Blending extends js.Object
@js.native
@JSGlobal("THREE.NoBlending")
val NoBlending: Blending = js.native
@js.native
@JSGlobal("THREE.NormalBlending")
val NormalBlending: Blending = js.native
@js.native
@JSGlobal("THREE.AdditiveBlending")
val AdditiveBlending: Blending = js.native
@js.native
@JSGlobal("THREE.SubtractiveBlending")
val SubtractiveBlending: Blending = js.native
@js.native
@JSGlobal("THREE.MultiplyBlending")
val MultiplyBlending: Blending = js.native
@js.native
@JSGlobal("THREE.CustomBlending")
val CustomBlending: Blending = js.native

@js.native
trait BlendingEquation extends js.Object
@js.native
@JSGlobal("THREE.AddEquation")
val AddEquation: BlendingEquation = js.native
@js.native
@JSGlobal("THREE.SubtractEquation")
val SubtractEquation: BlendingEquation = js.native
@js.native
@JSGlobal("THREE.ReverseSubtractEquation")
val ReverseSubtractEquation: BlendingEquation = js.native
@js.native
@JSGlobal("THREE.MinEquation")
val MinEquation: BlendingEquation = js.native
@js.native
@JSGlobal("THREE.MaxEquation")
val MaxEquation: BlendingEquation = js.native

@js.native
trait BlendingDstFactor extends js.Object
@js.native
@JSGlobal("THREE.ZeroFactor")
val ZeroFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.OneFactor")
val OneFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.SrcColorFactor")
val SrcColorFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.OneMinusSrcColorFactor")
val OneMinusSrcColorFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.SrcAlphaFactor")
val SrcAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.OneMinusSrcAlphaFactor")
val OneMinusSrcAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.DstAlphaFactor")
val DstAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.OneMinusDstAlphaFactor")
val OneMinusDstAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.DstColorFactor")
val DstColorFactor: BlendingDstFactor = js.native
@js.native
@JSGlobal("THREE.OneMinusDstColorFactor")
val OneMinusDstColorFactor: BlendingDstFactor = js.native

@js.native
trait BlendingSrcFactor extends js.Object
@js.native
@JSGlobal("THREE.SrcAlphaSaturateFactor")
val SrcAlphaSaturateFactor: BlendingSrcFactor = js.native

@js.native
trait DepthModes extends js.Object
@js.native
@JSGlobal("THREE.NeverDepth")
val NeverDepth: DepthModes = js.native
@js.native
@JSGlobal("THREE.AlwaysDepth")
val AlwaysDepth: DepthModes = js.native
@js.native
@JSGlobal("THREE.LessDepth")
val LessDepth: DepthModes = js.native
@js.native
@JSGlobal("THREE.LessEqualDepth")
val LessEqualDepth: DepthModes = js.native
@js.native
@JSGlobal("THREE.EqualDepth")
val EqualDepth: DepthModes = js.native
@js.native
@JSGlobal("THREE.GreaterEqualDepth")
val GreaterEqualDepth: DepthModes = js.native
@js.native
@JSGlobal("THREE.GreaterDepth")
val GreaterDepth: DepthModes = js.native
@js.native
@JSGlobal("THREE.NotEqualDepth")
val NotEqualDepth: DepthModes = js.native

@js.native
trait Combine extends js.Object
@js.native
@JSGlobal("THREE.MultiplyOperation")
val MultiplyOperation: Combine = js.native
@js.native
@JSGlobal("THREE.MixOperation")
val MixOperation: Combine = js.native
@js.native
@JSGlobal("THREE.AddOperation")
val AddOperation: Combine = js.native

@js.native
trait ToneMapping extends js.Object
@js.native
@JSGlobal("THREE.NoToneMapping")
val NoToneMapping: ToneMapping = js.native
@js.native
@JSGlobal("THREE.LinearToneMapping")
val LinearToneMapping: ToneMapping = js.native
@js.native
@JSGlobal("THREE.ReinhardToneMapping")
val ReinhardToneMapping: ToneMapping = js.native
@js.native
@JSGlobal("THREE.CineonToneMapping")
val CineonToneMapping: ToneMapping = js.native
@js.native
@JSGlobal("THREE.ACESFilmicToneMapping")
val ACESFilmicToneMapping: ToneMapping = js.native

@js.native
trait Mapping extends js.Object
@js.native
@JSGlobal("THREE.UVMapping")
val UVMapping: Mapping = js.native
@js.native
@JSGlobal("THREE.CubeReflectionMapping")
val CubeReflectionMapping: Mapping = js.native
@js.native
@JSGlobal("THREE.CubeRefractionMapping")
val CubeRefractionMapping: Mapping = js.native
@js.native
@JSGlobal("THREE.EquirectangularReflectionMapping")
val EquirectangularReflectionMapping: Mapping = js.native
@js.native
@JSGlobal("THREE.EquirectangularRefractionMapping")
val EquirectangularRefractionMapping: Mapping = js.native
@js.native
@JSGlobal("THREE.CubeUVReflectionMapping")
val CubeUVReflectionMapping: Mapping = js.native
@js.native
@JSGlobal("THREE.CubeUVRefractionMapping")
val CubeUVRefractionMapping: Mapping = js.native

@js.native
trait Wrapping extends js.Object
@js.native
@JSGlobal("THREE.RepeatWrapping")
val RepeatWrapping: Wrapping = js.native
@js.native
@JSGlobal("THREE.ClampToEdgeWrapping")
val ClampToEdgeWrapping: Wrapping = js.native
@js.native
@JSGlobal("THREE.MirroredRepeatWrapping")
val MirroredRepeatWrapping: Wrapping = js.native

@js.native
trait TextureFilter extends js.Object
@js.native
@JSGlobal("THREE.NearestFilter")
val NearestFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.NearestMipmapNearestFilter")
val NearestMipmapNearestFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.NearestMipMapNearestFilter")
val NearestMipMapNearestFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.NearestMipmapLinearFilter")
val NearestMipmapLinearFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.NearestMipMapLinearFilter")
val NearestMipMapLinearFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.LinearFilter")
val LinearFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.LinearMipmapNearestFilter")
val LinearMipmapNearestFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.LinearMipMapNearestFilter")
val LinearMipMapNearestFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.LinearMipmapLinearFilter")
val LinearMipmapLinearFilter: TextureFilter = js.native
@js.native
@JSGlobal("THREE.LinearMipMapLinearFilter")
val LinearMipMapLinearFilter: TextureFilter = js.native

@js.native
trait TextureDataType extends js.Object
@js.native
@JSGlobal("THREE.UnsignedByteType")
val UnsignedByteType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.ByteType")
val ByteType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.ShortType")
val ShortType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.UnsignedShortType")
val UnsignedShortType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.IntType")
val IntType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.UnsignedIntType")
val UnsignedIntType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.FloatType")
val FloatType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.HalfFloatType")
val HalfFloatType: TextureDataType = js.native
@js.native
@JSGlobal("THREE.UnsignedShort4444Type")
val UnsignedShort4444Type: TextureDataType = js.native
@js.native
@JSGlobal("THREE.UnsignedShort5551Type")
val UnsignedShort5551Type: TextureDataType = js.native
@js.native
@JSGlobal("THREE.UnsignedShort565Type")
val UnsignedShort565Type: TextureDataType = js.native
@js.native
@JSGlobal("THREE.UnsignedInt248Type")
val UnsignedInt248Type: TextureDataType = js.native

@js.native
trait PixelFormat extends js.Object
@js.native
@JSGlobal("THREE.AlphaFormat")
val AlphaFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBFormat")
val RGBFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBAFormat")
val RGBAFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.LuminanceFormat")
val LuminanceFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.LuminanceAlphaFormat")
val LuminanceAlphaFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBEFormat")
val RGBEFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.DepthFormat")
val DepthFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.DepthStencilFormat")
val DepthStencilFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RedFormat")
val RedFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RedIntegerFormat")
val RedIntegerFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RGFormat")
val RGFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RGIntegerFormat")
val RGIntegerFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBIntegerFormat")
val RGBIntegerFormat: PixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBAIntegerFormat")
val RGBAIntegerFormat: PixelFormat = js.native

type PixelFormatGPU = "ALPHA" | "RGB" | "RGBA" | "LUMINANCE" | "LUMINANCE_ALPHA" | "RED_INTEGER" | "R8" | "R8_SNORM" | "R8I" | "R8UI" | "R16I" | "R16UI" | "R16F" | "R32I" | "R32UI" | "R32F" | "RG8" | "RG8_SNORM" | "RG8I" | "RG8UI" | "RG16I" | "RG16UI" | "RG16F" | "RG32I" | "RG32UI" | "RG32F" | "RGB565" | "RGB8" | "RGB8_SNORM" | "RGB8I" | "RGB8UI" | "RGB16I" | "RGB16UI" | "RGB16F" | "RGB32I" | "RGB32UI" | "RGB32F" | "RGB9_E5" | "SRGB8" | "R11F_G11F_B10F" | "RGBA4" | "RGBA8" | "RGBA8_SNORM" | "RGBA8I" | "RGBA8UI" | "RGBA16I" | "RGBA16UI" | "RGBA16F" | "RGBA32I" | "RGBA32UI" | "RGBA32F" | "RGB5_A1" | "RGB10_A2" | "RGB10_A2UI" | "SRGB8_ALPHA8" | "DEPTH_COMPONENT16" | "DEPTH_COMPONENT24" | "DEPTH_COMPONENT32F" | "DEPTH24_STENCIL8" | "DEPTH32F_STENCIL8"

@js.native
trait CompressedPixelFormat extends js.Object
@js.native
@JSGlobal("THREE.RGB_S3TC_DXT1_Format")
val RGB_S3TC_DXT1_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_S3TC_DXT1_Format")
val RGBA_S3TC_DXT1_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_S3TC_DXT3_Format")
val RGBA_S3TC_DXT3_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_S3TC_DXT5_Format")
val RGBA_S3TC_DXT5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGB_PVRTC_4BPPV1_Format")
val RGB_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGB_PVRTC_2BPPV1_Format")
val RGB_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_PVRTC_4BPPV1_Format")
val RGBA_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_PVRTC_2BPPV1_Format")
val RGBA_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGB_ETC1_Format")
val RGB_ETC1_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGB_ETC2_Format")
val RGB_ETC2_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ETC2_EAC_Format")
val RGBA_ETC2_EAC_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_4x4_Format")
val RGBA_ASTC_4x4_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_5x4_Format")
val RGBA_ASTC_5x4_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_5x5_Format")
val RGBA_ASTC_5x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_6x5_Format")
val RGBA_ASTC_6x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_6x6_Format")
val RGBA_ASTC_6x6_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_8x5_Format")
val RGBA_ASTC_8x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_8x6_Format")
val RGBA_ASTC_8x6_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_8x8_Format")
val RGBA_ASTC_8x8_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_10x5_Format")
val RGBA_ASTC_10x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_10x6_Format")
val RGBA_ASTC_10x6_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_10x8_Format")
val RGBA_ASTC_10x8_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_10x10_Format")
val RGBA_ASTC_10x10_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_12x10_Format")
val RGBA_ASTC_12x10_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_ASTC_12x12_Format")
val RGBA_ASTC_12x12_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_4x4_Format")
val SRGB8_ALPHA8_ASTC_4x4_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_5x4_Format")
val SRGB8_ALPHA8_ASTC_5x4_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_5x5_Format")
val SRGB8_ALPHA8_ASTC_5x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_6x5_Format")
val SRGB8_ALPHA8_ASTC_6x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_6x6_Format")
val SRGB8_ALPHA8_ASTC_6x6_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_8x5_Format")
val SRGB8_ALPHA8_ASTC_8x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_8x6_Format")
val SRGB8_ALPHA8_ASTC_8x6_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_8x8_Format")
val SRGB8_ALPHA8_ASTC_8x8_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_10x5_Format")
val SRGB8_ALPHA8_ASTC_10x5_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_10x6_Format")
val SRGB8_ALPHA8_ASTC_10x6_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_10x8_Format")
val SRGB8_ALPHA8_ASTC_10x8_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_10x10_Format")
val SRGB8_ALPHA8_ASTC_10x10_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_12x10_Format")
val SRGB8_ALPHA8_ASTC_12x10_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.SRGB8_ALPHA8_ASTC_12x12_Format")
val SRGB8_ALPHA8_ASTC_12x12_Format: CompressedPixelFormat = js.native
@js.native
@JSGlobal("THREE.RGBA_BPTC_Format")
val RGBA_BPTC_Format: CompressedPixelFormat = js.native

@js.native
trait AnimationActionLoopStyles extends js.Object
@js.native
@JSGlobal("THREE.LoopOnce")
val LoopOnce: AnimationActionLoopStyles = js.native
@js.native
@JSGlobal("THREE.LoopRepeat")
val LoopRepeat: AnimationActionLoopStyles = js.native
@js.native
@JSGlobal("THREE.LoopPingPong")
val LoopPingPong: AnimationActionLoopStyles = js.native

@js.native
trait InterpolationModes extends js.Object
@js.native
@JSGlobal("THREE.InterpolateDiscrete")
val InterpolateDiscrete: InterpolationModes = js.native
@js.native
@JSGlobal("THREE.InterpolateLinear")
val InterpolateLinear: InterpolationModes = js.native
@js.native
@JSGlobal("THREE.InterpolateSmooth")
val InterpolateSmooth: InterpolationModes = js.native

@js.native
trait InterpolationEndingModes extends js.Object
@js.native
@JSGlobal("THREE.ZeroCurvatureEnding")
val ZeroCurvatureEnding: InterpolationEndingModes = js.native
@js.native
@JSGlobal("THREE.ZeroSlopeEnding")
val ZeroSlopeEnding: InterpolationEndingModes = js.native
@js.native
@JSGlobal("THREE.WrapAroundEnding")
val WrapAroundEnding: InterpolationEndingModes = js.native

@js.native
trait AnimationBlendMode extends js.Object
@js.native
@JSGlobal("THREE.NormalAnimationBlendMode")
val NormalAnimationBlendMode: AnimationBlendMode = js.native
@js.native
@JSGlobal("THREE.AdditiveAnimationBlendMode")
val AdditiveAnimationBlendMode: AnimationBlendMode = js.native

@js.native
trait TrianglesDrawModes extends js.Object
@js.native
@JSGlobal("THREE.TrianglesDrawMode")
val TrianglesDrawMode: TrianglesDrawModes = js.native
@js.native
@JSGlobal("THREE.TriangleStripDrawMode")
val TriangleStripDrawMode: TrianglesDrawModes = js.native
@js.native
@JSGlobal("THREE.TriangleFanDrawMode")
val TriangleFanDrawMode: TrianglesDrawModes = js.native

@js.native
trait TextureEncoding extends js.Object
@js.native
@JSGlobal("THREE.LinearEncoding")
val LinearEncoding: TextureEncoding = js.native
@js.native
@JSGlobal("THREE.sRGBEncoding")
val sRGBEncoding: TextureEncoding = js.native
@js.native
@JSGlobal("THREE.GammaEncoding")
val GammaEncoding: TextureEncoding = js.native
@js.native
@JSGlobal("THREE.RGBEEncoding")
val RGBEEncoding: TextureEncoding = js.native
@js.native
@JSGlobal("THREE.LogLuvEncoding")
val LogLuvEncoding: TextureEncoding = js.native
@js.native
@JSGlobal("THREE.RGBM7Encoding")
val RGBM7Encoding: TextureEncoding = js.native
@js.native
@JSGlobal("THREE.RGBM16Encoding")
val RGBM16Encoding: TextureEncoding = js.native
@js.native
@JSGlobal("THREE.RGBDEncoding")
val RGBDEncoding: TextureEncoding = js.native

@js.native
trait DepthPackingStrategies extends js.Object
@js.native
@JSGlobal("THREE.BasicDepthPacking")
val BasicDepthPacking: DepthPackingStrategies = js.native
@js.native
@JSGlobal("THREE.RGBADepthPacking")
val RGBADepthPacking: DepthPackingStrategies = js.native

@js.native
trait NormalMapTypes extends js.Object
@js.native
@JSGlobal("THREE.TangentSpaceNormalMap")
val TangentSpaceNormalMap: NormalMapTypes = js.native
@js.native
@JSGlobal("THREE.ObjectSpaceNormalMap")
val ObjectSpaceNormalMap: NormalMapTypes = js.native

@js.native
trait StencilOp extends js.Object
@js.native
@JSGlobal("THREE.ZeroStencilOp")
val ZeroStencilOp: StencilOp = js.native
@js.native
@JSGlobal("THREE.KeepStencilOp")
val KeepStencilOp: StencilOp = js.native
@js.native
@JSGlobal("THREE.ReplaceStencilOp")
val ReplaceStencilOp: StencilOp = js.native
@js.native
@JSGlobal("THREE.IncrementStencilOp")
val IncrementStencilOp: StencilOp = js.native
@js.native
@JSGlobal("THREE.DecrementStencilOp")
val DecrementStencilOp: StencilOp = js.native
@js.native
@JSGlobal("THREE.IncrementWrapStencilOp")
val IncrementWrapStencilOp: StencilOp = js.native
@js.native
@JSGlobal("THREE.DecrementWrapStencilOp")
val DecrementWrapStencilOp: StencilOp = js.native
@js.native
@JSGlobal("THREE.InvertStencilOp")
val InvertStencilOp: StencilOp = js.native

@js.native
trait StencilFunc extends js.Object
@js.native
@JSGlobal("THREE.NeverStencilFunc")
val NeverStencilFunc: StencilFunc = js.native
@js.native
@JSGlobal("THREE.LessStencilFunc")
val LessStencilFunc: StencilFunc = js.native
@js.native
@JSGlobal("THREE.EqualStencilFunc")
val EqualStencilFunc: StencilFunc = js.native
@js.native
@JSGlobal("THREE.LessEqualStencilFunc")
val LessEqualStencilFunc: StencilFunc = js.native
@js.native
@JSGlobal("THREE.GreaterStencilFunc")
val GreaterStencilFunc: StencilFunc = js.native
@js.native
@JSGlobal("THREE.NotEqualStencilFunc")
val NotEqualStencilFunc: StencilFunc = js.native
@js.native
@JSGlobal("THREE.GreaterEqualStencilFunc")
val GreaterEqualStencilFunc: StencilFunc = js.native
@js.native
@JSGlobal("THREE.AlwaysStencilFunc")
val AlwaysStencilFunc: StencilFunc = js.native

@js.native
trait Usage extends js.Object
@js.native
@JSGlobal("THREE.StaticDrawUsage")
val StaticDrawUsage: Usage = js.native
@js.native
@JSGlobal("THREE.DynamicDrawUsage")
val DynamicDrawUsage: Usage = js.native
@js.native
@JSGlobal("THREE.StreamDrawUsage")
val StreamDrawUsage: Usage = js.native
@js.native
@JSGlobal("THREE.StaticReadUsage")
val StaticReadUsage: Usage = js.native
@js.native
@JSGlobal("THREE.DynamicReadUsage")
val DynamicReadUsage: Usage = js.native
@js.native
@JSGlobal("THREE.StreamReadUsage")
val StreamReadUsage: Usage = js.native
@js.native
@JSGlobal("THREE.StaticCopyUsage")
val StaticCopyUsage: Usage = js.native
@js.native
@JSGlobal("THREE.DynamicCopyUsage")
val DynamicCopyUsage: Usage = js.native
@js.native
@JSGlobal("THREE.StreamCopyUsage")
val StreamCopyUsage: Usage = js.native

@js.native
trait GLSLVersion extends js.Object
@js.native
@JSGlobal("THREE.GLSL1")
val GLSL1: GLSLVersion = js.native
@js.native
@JSGlobal("THREE.GLSL3")
val GLSL3: GLSLVersion = js.native

type BuiltinShaderAttributeName = "position" | "normal" | "uv" | "color" | "skinIndex" | "skinWeight" | "instanceMatrix" | "morphTarget0" | "morphTarget1" | "morphTarget2" | "morphTarget3" | "morphTarget4" | "morphTarget5" | "morphTarget6" | "morphTarget7" | "morphNormal0" | "morphNormal1" | "morphNormal2" | "morphNormal3"

@js.native
@JSGlobal("THREE.MOUSE")
object MOUSE extends js.Object:
	val LEFT: MOUSE = js.native
	val MIDDLE: MOUSE = js.native
	val RIGHT: MOUSE = js.native
	val ROTATE: MOUSE = js.native
	val DOLLY: MOUSE = js.native
	val PAN: MOUSE = js.native

@js.native
@JSGlobal("THREE.TOUCH")
object TOUCH extends js.Object:
	val ROTATE: TOUCH = js.native
	val PAN: TOUCH = js.native
	val DOLLY_PAN: TOUCH = js.native
	val DOLLY_ROTATE: TOUCH = js.native

type ColorRepresentation = Color | String | Double
