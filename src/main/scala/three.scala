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
@JSImport("three","REVISION")
val REVISION: String = js.native

@js.native
trait MOUSE extends js.Object

@js.native
trait TOUCH extends js.Object

@js.native
trait CullFace extends js.Object
@js.native
@JSImport("three","CullFaceNone")
val CullFaceNone: CullFace = js.native
@js.native
@JSImport("three","CullFaceBack")
val CullFaceBack: CullFace = js.native
@js.native
@JSImport("three","CullFaceFront")
val CullFaceFront: CullFace = js.native
@js.native
@JSImport("three","CullFaceFrontBack")
val CullFaceFrontBack: CullFace = js.native

@js.native
trait ShadowMapType extends js.Object
@js.native
@JSImport("three","BasicShadowMap")
val BasicShadowMap: ShadowMapType = js.native
@js.native
@JSImport("three","PCFShadowMap")
val PCFShadowMap: ShadowMapType = js.native
@js.native
@JSImport("three","PCFSoftShadowMap")
val PCFSoftShadowMap: ShadowMapType = js.native
@js.native
@JSImport("three","VSMShadowMap")
val VSMShadowMap: ShadowMapType = js.native

@js.native
trait Side extends js.Object
@js.native
@JSImport("three","FrontSide")
val FrontSide: Side = js.native
@js.native
@JSImport("three","BackSide")
val BackSide: Side = js.native
@js.native
@JSImport("three","DoubleSide")
val DoubleSide: Side = js.native

@js.native
trait Shading extends js.Object
@js.native
@JSImport("three","FlatShading")
val FlatShading: Shading = js.native
@js.native
@JSImport("three","SmoothShading")
val SmoothShading: Shading = js.native

@js.native
trait Blending extends js.Object
@js.native
@JSImport("three","NoBlending")
val NoBlending: Blending = js.native
@js.native
@JSImport("three","NormalBlending")
val NormalBlending: Blending = js.native
@js.native
@JSImport("three","AdditiveBlending")
val AdditiveBlending: Blending = js.native
@js.native
@JSImport("three","SubtractiveBlending")
val SubtractiveBlending: Blending = js.native
@js.native
@JSImport("three","MultiplyBlending")
val MultiplyBlending: Blending = js.native
@js.native
@JSImport("three","CustomBlending")
val CustomBlending: Blending = js.native

@js.native
trait BlendingEquation extends js.Object
@js.native
@JSImport("three","AddEquation")
val AddEquation: BlendingEquation = js.native
@js.native
@JSImport("three","SubtractEquation")
val SubtractEquation: BlendingEquation = js.native
@js.native
@JSImport("three","ReverseSubtractEquation")
val ReverseSubtractEquation: BlendingEquation = js.native
@js.native
@JSImport("three","MinEquation")
val MinEquation: BlendingEquation = js.native
@js.native
@JSImport("three","MaxEquation")
val MaxEquation: BlendingEquation = js.native

@js.native
trait BlendingDstFactor extends js.Object
@js.native
@JSImport("three","ZeroFactor")
val ZeroFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","OneFactor")
val OneFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","SrcColorFactor")
val SrcColorFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","OneMinusSrcColorFactor")
val OneMinusSrcColorFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","SrcAlphaFactor")
val SrcAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","OneMinusSrcAlphaFactor")
val OneMinusSrcAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","DstAlphaFactor")
val DstAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","OneMinusDstAlphaFactor")
val OneMinusDstAlphaFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","DstColorFactor")
val DstColorFactor: BlendingDstFactor = js.native
@js.native
@JSImport("three","OneMinusDstColorFactor")
val OneMinusDstColorFactor: BlendingDstFactor = js.native

@js.native
trait BlendingSrcFactor extends js.Object
@js.native
@JSImport("three","SrcAlphaSaturateFactor")
val SrcAlphaSaturateFactor: BlendingSrcFactor = js.native

@js.native
trait DepthModes extends js.Object
@js.native
@JSImport("three","NeverDepth")
val NeverDepth: DepthModes = js.native
@js.native
@JSImport("three","AlwaysDepth")
val AlwaysDepth: DepthModes = js.native
@js.native
@JSImport("three","LessDepth")
val LessDepth: DepthModes = js.native
@js.native
@JSImport("three","LessEqualDepth")
val LessEqualDepth: DepthModes = js.native
@js.native
@JSImport("three","EqualDepth")
val EqualDepth: DepthModes = js.native
@js.native
@JSImport("three","GreaterEqualDepth")
val GreaterEqualDepth: DepthModes = js.native
@js.native
@JSImport("three","GreaterDepth")
val GreaterDepth: DepthModes = js.native
@js.native
@JSImport("three","NotEqualDepth")
val NotEqualDepth: DepthModes = js.native

@js.native
trait Combine extends js.Object
@js.native
@JSImport("three","MultiplyOperation")
val MultiplyOperation: Combine = js.native
@js.native
@JSImport("three","MixOperation")
val MixOperation: Combine = js.native
@js.native
@JSImport("three","AddOperation")
val AddOperation: Combine = js.native

@js.native
trait ToneMapping extends js.Object
@js.native
@JSImport("three","NoToneMapping")
val NoToneMapping: ToneMapping = js.native
@js.native
@JSImport("three","LinearToneMapping")
val LinearToneMapping: ToneMapping = js.native
@js.native
@JSImport("three","ReinhardToneMapping")
val ReinhardToneMapping: ToneMapping = js.native
@js.native
@JSImport("three","CineonToneMapping")
val CineonToneMapping: ToneMapping = js.native
@js.native
@JSImport("three","ACESFilmicToneMapping")
val ACESFilmicToneMapping: ToneMapping = js.native

@js.native
trait Mapping extends js.Object
@js.native
@JSImport("three","UVMapping")
val UVMapping: Mapping = js.native
@js.native
@JSImport("three","CubeReflectionMapping")
val CubeReflectionMapping: Mapping = js.native
@js.native
@JSImport("three","CubeRefractionMapping")
val CubeRefractionMapping: Mapping = js.native
@js.native
@JSImport("three","EquirectangularReflectionMapping")
val EquirectangularReflectionMapping: Mapping = js.native
@js.native
@JSImport("three","EquirectangularRefractionMapping")
val EquirectangularRefractionMapping: Mapping = js.native
@js.native
@JSImport("three","CubeUVReflectionMapping")
val CubeUVReflectionMapping: Mapping = js.native
@js.native
@JSImport("three","CubeUVRefractionMapping")
val CubeUVRefractionMapping: Mapping = js.native

@js.native
trait Wrapping extends js.Object
@js.native
@JSImport("three","RepeatWrapping")
val RepeatWrapping: Wrapping = js.native
@js.native
@JSImport("three","ClampToEdgeWrapping")
val ClampToEdgeWrapping: Wrapping = js.native
@js.native
@JSImport("three","MirroredRepeatWrapping")
val MirroredRepeatWrapping: Wrapping = js.native

@js.native
trait TextureFilter extends js.Object
@js.native
@JSImport("three","NearestFilter")
val NearestFilter: TextureFilter = js.native
@js.native
@JSImport("three","NearestMipmapNearestFilter")
val NearestMipmapNearestFilter: TextureFilter = js.native
@js.native
@JSImport("three","NearestMipMapNearestFilter")
val NearestMipMapNearestFilter: TextureFilter = js.native
@js.native
@JSImport("three","NearestMipmapLinearFilter")
val NearestMipmapLinearFilter: TextureFilter = js.native
@js.native
@JSImport("three","NearestMipMapLinearFilter")
val NearestMipMapLinearFilter: TextureFilter = js.native
@js.native
@JSImport("three","LinearFilter")
val LinearFilter: TextureFilter = js.native
@js.native
@JSImport("three","LinearMipmapNearestFilter")
val LinearMipmapNearestFilter: TextureFilter = js.native
@js.native
@JSImport("three","LinearMipMapNearestFilter")
val LinearMipMapNearestFilter: TextureFilter = js.native
@js.native
@JSImport("three","LinearMipmapLinearFilter")
val LinearMipmapLinearFilter: TextureFilter = js.native
@js.native
@JSImport("three","LinearMipMapLinearFilter")
val LinearMipMapLinearFilter: TextureFilter = js.native

@js.native
trait TextureDataType extends js.Object
@js.native
@JSImport("three","UnsignedByteType")
val UnsignedByteType: TextureDataType = js.native
@js.native
@JSImport("three","ByteType")
val ByteType: TextureDataType = js.native
@js.native
@JSImport("three","ShortType")
val ShortType: TextureDataType = js.native
@js.native
@JSImport("three","UnsignedShortType")
val UnsignedShortType: TextureDataType = js.native
@js.native
@JSImport("three","IntType")
val IntType: TextureDataType = js.native
@js.native
@JSImport("three","UnsignedIntType")
val UnsignedIntType: TextureDataType = js.native
@js.native
@JSImport("three","FloatType")
val FloatType: TextureDataType = js.native
@js.native
@JSImport("three","HalfFloatType")
val HalfFloatType: TextureDataType = js.native
@js.native
@JSImport("three","UnsignedShort4444Type")
val UnsignedShort4444Type: TextureDataType = js.native
@js.native
@JSImport("three","UnsignedShort5551Type")
val UnsignedShort5551Type: TextureDataType = js.native
@js.native
@JSImport("three","UnsignedShort565Type")
val UnsignedShort565Type: TextureDataType = js.native
@js.native
@JSImport("three","UnsignedInt248Type")
val UnsignedInt248Type: TextureDataType = js.native

@js.native
trait PixelFormat extends js.Object
@js.native
@JSImport("three","AlphaFormat")
val AlphaFormat: PixelFormat = js.native
@js.native
@JSImport("three","RGBFormat")
val RGBFormat: PixelFormat = js.native
@js.native
@JSImport("three","RGBAFormat")
val RGBAFormat: PixelFormat = js.native
@js.native
@JSImport("three","LuminanceFormat")
val LuminanceFormat: PixelFormat = js.native
@js.native
@JSImport("three","LuminanceAlphaFormat")
val LuminanceAlphaFormat: PixelFormat = js.native
@js.native
@JSImport("three","RGBEFormat")
val RGBEFormat: PixelFormat = js.native
@js.native
@JSImport("three","DepthFormat")
val DepthFormat: PixelFormat = js.native
@js.native
@JSImport("three","DepthStencilFormat")
val DepthStencilFormat: PixelFormat = js.native
@js.native
@JSImport("three","RedFormat")
val RedFormat: PixelFormat = js.native
@js.native
@JSImport("three","RedIntegerFormat")
val RedIntegerFormat: PixelFormat = js.native
@js.native
@JSImport("three","RGFormat")
val RGFormat: PixelFormat = js.native
@js.native
@JSImport("three","RGIntegerFormat")
val RGIntegerFormat: PixelFormat = js.native
@js.native
@JSImport("three","RGBIntegerFormat")
val RGBIntegerFormat: PixelFormat = js.native
@js.native
@JSImport("three","RGBAIntegerFormat")
val RGBAIntegerFormat: PixelFormat = js.native

type PixelFormatGPU = "ALPHA" | "RGB" | "RGBA" | "LUMINANCE" | "LUMINANCE_ALPHA" | "RED_INTEGER" | "R8" | "R8_SNORM" | "R8I" | "R8UI" | "R16I" | "R16UI" | "R16F" | "R32I" | "R32UI" | "R32F" | "RG8" | "RG8_SNORM" | "RG8I" | "RG8UI" | "RG16I" | "RG16UI" | "RG16F" | "RG32I" | "RG32UI" | "RG32F" | "RGB565" | "RGB8" | "RGB8_SNORM" | "RGB8I" | "RGB8UI" | "RGB16I" | "RGB16UI" | "RGB16F" | "RGB32I" | "RGB32UI" | "RGB32F" | "RGB9_E5" | "SRGB8" | "R11F_G11F_B10F" | "RGBA4" | "RGBA8" | "RGBA8_SNORM" | "RGBA8I" | "RGBA8UI" | "RGBA16I" | "RGBA16UI" | "RGBA16F" | "RGBA32I" | "RGBA32UI" | "RGBA32F" | "RGB5_A1" | "RGB10_A2" | "RGB10_A2UI" | "SRGB8_ALPHA8" | "DEPTH_COMPONENT16" | "DEPTH_COMPONENT24" | "DEPTH_COMPONENT32F" | "DEPTH24_STENCIL8" | "DEPTH32F_STENCIL8"

@js.native
trait CompressedPixelFormat extends js.Object
@js.native
@JSImport("three","RGB_S3TC_DXT1_Format")
val RGB_S3TC_DXT1_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_S3TC_DXT1_Format")
val RGBA_S3TC_DXT1_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_S3TC_DXT3_Format")
val RGBA_S3TC_DXT3_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_S3TC_DXT5_Format")
val RGBA_S3TC_DXT5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGB_PVRTC_4BPPV1_Format")
val RGB_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGB_PVRTC_2BPPV1_Format")
val RGB_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_PVRTC_4BPPV1_Format")
val RGBA_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_PVRTC_2BPPV1_Format")
val RGBA_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGB_ETC1_Format")
val RGB_ETC1_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGB_ETC2_Format")
val RGB_ETC2_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ETC2_EAC_Format")
val RGBA_ETC2_EAC_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_4x4_Format")
val RGBA_ASTC_4x4_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_5x4_Format")
val RGBA_ASTC_5x4_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_5x5_Format")
val RGBA_ASTC_5x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_6x5_Format")
val RGBA_ASTC_6x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_6x6_Format")
val RGBA_ASTC_6x6_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_8x5_Format")
val RGBA_ASTC_8x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_8x6_Format")
val RGBA_ASTC_8x6_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_8x8_Format")
val RGBA_ASTC_8x8_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_10x5_Format")
val RGBA_ASTC_10x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_10x6_Format")
val RGBA_ASTC_10x6_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_10x8_Format")
val RGBA_ASTC_10x8_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_10x10_Format")
val RGBA_ASTC_10x10_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_12x10_Format")
val RGBA_ASTC_12x10_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_ASTC_12x12_Format")
val RGBA_ASTC_12x12_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_4x4_Format")
val SRGB8_ALPHA8_ASTC_4x4_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_5x4_Format")
val SRGB8_ALPHA8_ASTC_5x4_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_5x5_Format")
val SRGB8_ALPHA8_ASTC_5x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_6x5_Format")
val SRGB8_ALPHA8_ASTC_6x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_6x6_Format")
val SRGB8_ALPHA8_ASTC_6x6_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_8x5_Format")
val SRGB8_ALPHA8_ASTC_8x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_8x6_Format")
val SRGB8_ALPHA8_ASTC_8x6_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_8x8_Format")
val SRGB8_ALPHA8_ASTC_8x8_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_10x5_Format")
val SRGB8_ALPHA8_ASTC_10x5_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_10x6_Format")
val SRGB8_ALPHA8_ASTC_10x6_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_10x8_Format")
val SRGB8_ALPHA8_ASTC_10x8_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_10x10_Format")
val SRGB8_ALPHA8_ASTC_10x10_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_12x10_Format")
val SRGB8_ALPHA8_ASTC_12x10_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","SRGB8_ALPHA8_ASTC_12x12_Format")
val SRGB8_ALPHA8_ASTC_12x12_Format: CompressedPixelFormat = js.native
@js.native
@JSImport("three","RGBA_BPTC_Format")
val RGBA_BPTC_Format: CompressedPixelFormat = js.native

@js.native
trait AnimationActionLoopStyles extends js.Object
@js.native
@JSImport("three","LoopOnce")
val LoopOnce: AnimationActionLoopStyles = js.native
@js.native
@JSImport("three","LoopRepeat")
val LoopRepeat: AnimationActionLoopStyles = js.native
@js.native
@JSImport("three","LoopPingPong")
val LoopPingPong: AnimationActionLoopStyles = js.native

@js.native
trait InterpolationModes extends js.Object
@js.native
@JSImport("three","InterpolateDiscrete")
val InterpolateDiscrete: InterpolationModes = js.native
@js.native
@JSImport("three","InterpolateLinear")
val InterpolateLinear: InterpolationModes = js.native
@js.native
@JSImport("three","InterpolateSmooth")
val InterpolateSmooth: InterpolationModes = js.native

@js.native
trait InterpolationEndingModes extends js.Object
@js.native
@JSImport("three","ZeroCurvatureEnding")
val ZeroCurvatureEnding: InterpolationEndingModes = js.native
@js.native
@JSImport("three","ZeroSlopeEnding")
val ZeroSlopeEnding: InterpolationEndingModes = js.native
@js.native
@JSImport("three","WrapAroundEnding")
val WrapAroundEnding: InterpolationEndingModes = js.native

@js.native
trait AnimationBlendMode extends js.Object
@js.native
@JSImport("three","NormalAnimationBlendMode")
val NormalAnimationBlendMode: AnimationBlendMode = js.native
@js.native
@JSImport("three","AdditiveAnimationBlendMode")
val AdditiveAnimationBlendMode: AnimationBlendMode = js.native

@js.native
trait TrianglesDrawModes extends js.Object
@js.native
@JSImport("three","TrianglesDrawMode")
val TrianglesDrawMode: TrianglesDrawModes = js.native
@js.native
@JSImport("three","TriangleStripDrawMode")
val TriangleStripDrawMode: TrianglesDrawModes = js.native
@js.native
@JSImport("three","TriangleFanDrawMode")
val TriangleFanDrawMode: TrianglesDrawModes = js.native

@js.native
trait TextureEncoding extends js.Object
@js.native
@JSImport("three","LinearEncoding")
val LinearEncoding: TextureEncoding = js.native
@js.native
@JSImport("three","sRGBEncoding")
val sRGBEncoding: TextureEncoding = js.native
@js.native
@JSImport("three","GammaEncoding")
val GammaEncoding: TextureEncoding = js.native
@js.native
@JSImport("three","RGBEEncoding")
val RGBEEncoding: TextureEncoding = js.native
@js.native
@JSImport("three","LogLuvEncoding")
val LogLuvEncoding: TextureEncoding = js.native
@js.native
@JSImport("three","RGBM7Encoding")
val RGBM7Encoding: TextureEncoding = js.native
@js.native
@JSImport("three","RGBM16Encoding")
val RGBM16Encoding: TextureEncoding = js.native
@js.native
@JSImport("three","RGBDEncoding")
val RGBDEncoding: TextureEncoding = js.native

@js.native
trait DepthPackingStrategies extends js.Object
@js.native
@JSImport("three","BasicDepthPacking")
val BasicDepthPacking: DepthPackingStrategies = js.native
@js.native
@JSImport("three","RGBADepthPacking")
val RGBADepthPacking: DepthPackingStrategies = js.native

@js.native
trait NormalMapTypes extends js.Object
@js.native
@JSImport("three","TangentSpaceNormalMap")
val TangentSpaceNormalMap: NormalMapTypes = js.native
@js.native
@JSImport("three","ObjectSpaceNormalMap")
val ObjectSpaceNormalMap: NormalMapTypes = js.native

@js.native
trait StencilOp extends js.Object
@js.native
@JSImport("three","ZeroStencilOp")
val ZeroStencilOp: StencilOp = js.native
@js.native
@JSImport("three","KeepStencilOp")
val KeepStencilOp: StencilOp = js.native
@js.native
@JSImport("three","ReplaceStencilOp")
val ReplaceStencilOp: StencilOp = js.native
@js.native
@JSImport("three","IncrementStencilOp")
val IncrementStencilOp: StencilOp = js.native
@js.native
@JSImport("three","DecrementStencilOp")
val DecrementStencilOp: StencilOp = js.native
@js.native
@JSImport("three","IncrementWrapStencilOp")
val IncrementWrapStencilOp: StencilOp = js.native
@js.native
@JSImport("three","DecrementWrapStencilOp")
val DecrementWrapStencilOp: StencilOp = js.native
@js.native
@JSImport("three","InvertStencilOp")
val InvertStencilOp: StencilOp = js.native

@js.native
trait StencilFunc extends js.Object
@js.native
@JSImport("three","NeverStencilFunc")
val NeverStencilFunc: StencilFunc = js.native
@js.native
@JSImport("three","LessStencilFunc")
val LessStencilFunc: StencilFunc = js.native
@js.native
@JSImport("three","EqualStencilFunc")
val EqualStencilFunc: StencilFunc = js.native
@js.native
@JSImport("three","LessEqualStencilFunc")
val LessEqualStencilFunc: StencilFunc = js.native
@js.native
@JSImport("three","GreaterStencilFunc")
val GreaterStencilFunc: StencilFunc = js.native
@js.native
@JSImport("three","NotEqualStencilFunc")
val NotEqualStencilFunc: StencilFunc = js.native
@js.native
@JSImport("three","GreaterEqualStencilFunc")
val GreaterEqualStencilFunc: StencilFunc = js.native
@js.native
@JSImport("three","AlwaysStencilFunc")
val AlwaysStencilFunc: StencilFunc = js.native

@js.native
trait Usage extends js.Object
@js.native
@JSImport("three","StaticDrawUsage")
val StaticDrawUsage: Usage = js.native
@js.native
@JSImport("three","DynamicDrawUsage")
val DynamicDrawUsage: Usage = js.native
@js.native
@JSImport("three","StreamDrawUsage")
val StreamDrawUsage: Usage = js.native
@js.native
@JSImport("three","StaticReadUsage")
val StaticReadUsage: Usage = js.native
@js.native
@JSImport("three","DynamicReadUsage")
val DynamicReadUsage: Usage = js.native
@js.native
@JSImport("three","StreamReadUsage")
val StreamReadUsage: Usage = js.native
@js.native
@JSImport("three","StaticCopyUsage")
val StaticCopyUsage: Usage = js.native
@js.native
@JSImport("three","DynamicCopyUsage")
val DynamicCopyUsage: Usage = js.native
@js.native
@JSImport("three","StreamCopyUsage")
val StreamCopyUsage: Usage = js.native

@js.native
trait GLSLVersion extends js.Object
@js.native
@JSImport("three","GLSL1")
val GLSL1: GLSLVersion = js.native
@js.native
@JSImport("three","GLSL3")
val GLSL3: GLSLVersion = js.native

type BuiltinShaderAttributeName = "position" | "normal" | "uv" | "color" | "skinIndex" | "skinWeight" | "instanceMatrix" | "morphTarget0" | "morphTarget1" | "morphTarget2" | "morphTarget3" | "morphTarget4" | "morphTarget5" | "morphTarget6" | "morphTarget7" | "morphNormal0" | "morphNormal1" | "morphNormal2" | "morphNormal3"

@js.native
@JSImport("three","MOUSE")
object MOUSE extends js.Object:
	val LEFT: MOUSE = js.native
	val MIDDLE: MOUSE = js.native
	val RIGHT: MOUSE = js.native
	val ROTATE: MOUSE = js.native
	val DOLLY: MOUSE = js.native
	val PAN: MOUSE = js.native

@js.native
@JSImport("three","TOUCH")
object TOUCH extends js.Object:
	val ROTATE: TOUCH = js.native
	val PAN: TOUCH = js.native
	val DOLLY_PAN: TOUCH = js.native
	val DOLLY_ROTATE: TOUCH = js.native

type ColorRepresentation = Color | String | Double
