package typings.three.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.extras.objects.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*

type ArrayLike[T] = js.native
type Record[K,V] = js.native
type WebGLBuffer = js.native
type MediaStream = js.native
type ImageBitmap = js.native
type BufferSource = js.native
type MimeType = js.native
type WebGL2RenderingContext = js.native
type DOMPointReadOnly = js.native
type DOMHighResTimeStamp = js.native

val REVISION: String = js.native;

@js.native
sealed trait MOUSE extends js.Object

@js.native
sealed trait TOUCH extends js.Object

@js.native
sealed trait CullFace extends js.Object
val CullFaceNone: CullFace = js.native;
val CullFaceBack: CullFace = js.native;
val CullFaceFront: CullFace = js.native;
val CullFaceFrontBack: CullFace = js.native;

@js.native
sealed trait ShadowMapType extends js.Object
val BasicShadowMap: ShadowMapType = js.native;
val PCFShadowMap: ShadowMapType = js.native;
val PCFSoftShadowMap: ShadowMapType = js.native;
val VSMShadowMap: ShadowMapType = js.native;

@js.native
sealed trait Side extends js.Object
val FrontSide: Side = js.native;
val BackSide: Side = js.native;
val DoubleSide: Side = js.native;

@js.native
sealed trait Shading extends js.Object
val FlatShading: Shading = js.native;
val SmoothShading: Shading = js.native;

@js.native
sealed trait Blending extends js.Object
val NoBlending: Blending = js.native;
val NormalBlending: Blending = js.native;
val AdditiveBlending: Blending = js.native;
val SubtractiveBlending: Blending = js.native;
val MultiplyBlending: Blending = js.native;
val CustomBlending: Blending = js.native;

@js.native
sealed trait BlendingEquation extends js.Object
val AddEquation: BlendingEquation = js.native;
val SubtractEquation: BlendingEquation = js.native;
val ReverseSubtractEquation: BlendingEquation = js.native;
val MinEquation: BlendingEquation = js.native;
val MaxEquation: BlendingEquation = js.native;

@js.native
sealed trait BlendingDstFactor extends js.Object
val ZeroFactor: BlendingDstFactor = js.native;
val OneFactor: BlendingDstFactor = js.native;
val SrcColorFactor: BlendingDstFactor = js.native;
val OneMinusSrcColorFactor: BlendingDstFactor = js.native;
val SrcAlphaFactor: BlendingDstFactor = js.native;
val OneMinusSrcAlphaFactor: BlendingDstFactor = js.native;
val DstAlphaFactor: BlendingDstFactor = js.native;
val OneMinusDstAlphaFactor: BlendingDstFactor = js.native;
val DstColorFactor: BlendingDstFactor = js.native;
val OneMinusDstColorFactor: BlendingDstFactor = js.native;

@js.native
sealed trait BlendingSrcFactor extends js.Object
val SrcAlphaSaturateFactor: BlendingSrcFactor = js.native;

@js.native
sealed trait DepthModes extends js.Object
val NeverDepth: DepthModes = js.native;
val AlwaysDepth: DepthModes = js.native;
val LessDepth: DepthModes = js.native;
val LessEqualDepth: DepthModes = js.native;
val EqualDepth: DepthModes = js.native;
val GreaterEqualDepth: DepthModes = js.native;
val GreaterDepth: DepthModes = js.native;
val NotEqualDepth: DepthModes = js.native;

@js.native
sealed trait Combine extends js.Object
val MultiplyOperation: Combine = js.native;
val MixOperation: Combine = js.native;
val AddOperation: Combine = js.native;

@js.native
sealed trait ToneMapping extends js.Object
val NoToneMapping: ToneMapping = js.native;
val LinearToneMapping: ToneMapping = js.native;
val ReinhardToneMapping: ToneMapping = js.native;
val CineonToneMapping: ToneMapping = js.native;
val ACESFilmicToneMapping: ToneMapping = js.native;

@js.native
sealed trait Mapping extends js.Object
val UVMapping: Mapping = js.native;
val CubeReflectionMapping: Mapping = js.native;
val CubeRefractionMapping: Mapping = js.native;
val EquirectangularReflectionMapping: Mapping = js.native;
val EquirectangularRefractionMapping: Mapping = js.native;
val CubeUVReflectionMapping: Mapping = js.native;
val CubeUVRefractionMapping: Mapping = js.native;

@js.native
sealed trait Wrapping extends js.Object
val RepeatWrapping: Wrapping = js.native;
val ClampToEdgeWrapping: Wrapping = js.native;
val MirroredRepeatWrapping: Wrapping = js.native;

@js.native
sealed trait TextureFilter extends js.Object
val NearestFilter: TextureFilter = js.native;
val NearestMipmapNearestFilter: TextureFilter = js.native;
val NearestMipMapNearestFilter: TextureFilter = js.native;
val NearestMipmapLinearFilter: TextureFilter = js.native;
val NearestMipMapLinearFilter: TextureFilter = js.native;
val LinearFilter: TextureFilter = js.native;
val LinearMipmapNearestFilter: TextureFilter = js.native;
val LinearMipMapNearestFilter: TextureFilter = js.native;
val LinearMipmapLinearFilter: TextureFilter = js.native;
val LinearMipMapLinearFilter: TextureFilter = js.native;

@js.native
sealed trait TextureDataType extends js.Object
val UnsignedByteType: TextureDataType = js.native;
val ByteType: TextureDataType = js.native;
val ShortType: TextureDataType = js.native;
val UnsignedShortType: TextureDataType = js.native;
val IntType: TextureDataType = js.native;
val UnsignedIntType: TextureDataType = js.native;
val FloatType: TextureDataType = js.native;
val HalfFloatType: TextureDataType = js.native;
val UnsignedShort4444Type: TextureDataType = js.native;
val UnsignedShort5551Type: TextureDataType = js.native;
val UnsignedShort565Type: TextureDataType = js.native;
val UnsignedInt248Type: TextureDataType = js.native;

@js.native
sealed trait PixelFormat extends js.Object
val AlphaFormat: PixelFormat = js.native;
val RGBFormat: PixelFormat = js.native;
val RGBAFormat: PixelFormat = js.native;
val LuminanceFormat: PixelFormat = js.native;
val LuminanceAlphaFormat: PixelFormat = js.native;
val RGBEFormat: PixelFormat = js.native;
val DepthFormat: PixelFormat = js.native;
val DepthStencilFormat: PixelFormat = js.native;
val RedFormat: PixelFormat = js.native;
val RedIntegerFormat: PixelFormat = js.native;
val RGFormat: PixelFormat = js.native;
val RGIntegerFormat: PixelFormat = js.native;
val RGBIntegerFormat: PixelFormat = js.native;
val RGBAIntegerFormat: PixelFormat = js.native;

type PixelFormatGPU = "ALPHA" | "RGB" | "RGBA" | "LUMINANCE" | "LUMINANCE_ALPHA" | "RED_INTEGER" | "R8" | "R8_SNORM" | "R8I" | "R8UI" | "R16I" | "R16UI" | "R16F" | "R32I" | "R32UI" | "R32F" | "RG8" | "RG8_SNORM" | "RG8I" | "RG8UI" | "RG16I" | "RG16UI" | "RG16F" | "RG32I" | "RG32UI" | "RG32F" | "RGB565" | "RGB8" | "RGB8_SNORM" | "RGB8I" | "RGB8UI" | "RGB16I" | "RGB16UI" | "RGB16F" | "RGB32I" | "RGB32UI" | "RGB32F" | "RGB9_E5" | "SRGB8" | "R11F_G11F_B10F" | "RGBA4" | "RGBA8" | "RGBA8_SNORM" | "RGBA8I" | "RGBA8UI" | "RGBA16I" | "RGBA16UI" | "RGBA16F" | "RGBA32I" | "RGBA32UI" | "RGBA32F" | "RGB5_A1" | "RGB10_A2" | "RGB10_A2UI" | "SRGB8_ALPHA8" | "DEPTH_COMPONENT16" | "DEPTH_COMPONENT24" | "DEPTH_COMPONENT32F" | "DEPTH24_STENCIL8" | "DEPTH32F_STENCIL8"

@js.native
sealed trait CompressedPixelFormat extends js.Object
val RGB_S3TC_DXT1_Format: CompressedPixelFormat = js.native;
val RGBA_S3TC_DXT1_Format: CompressedPixelFormat = js.native;
val RGBA_S3TC_DXT3_Format: CompressedPixelFormat = js.native;
val RGBA_S3TC_DXT5_Format: CompressedPixelFormat = js.native;
val RGB_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native;
val RGB_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native;
val RGBA_PVRTC_4BPPV1_Format: CompressedPixelFormat = js.native;
val RGBA_PVRTC_2BPPV1_Format: CompressedPixelFormat = js.native;
val RGB_ETC1_Format: CompressedPixelFormat = js.native;
val RGB_ETC2_Format: CompressedPixelFormat = js.native;
val RGBA_ETC2_EAC_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_4x4_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_5x4_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_5x5_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_6x5_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_6x6_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_8x5_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_8x6_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_8x8_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_10x5_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_10x6_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_10x8_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_10x10_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_12x10_Format: CompressedPixelFormat = js.native;
val RGBA_ASTC_12x12_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_4x4_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_5x4_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_5x5_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_6x5_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_6x6_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_8x5_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_8x6_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_8x8_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_10x5_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_10x6_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_10x8_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_10x10_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_12x10_Format: CompressedPixelFormat = js.native;
val SRGB8_ALPHA8_ASTC_12x12_Format: CompressedPixelFormat = js.native;
val RGBA_BPTC_Format: CompressedPixelFormat = js.native;

@js.native
sealed trait AnimationActionLoopStyles extends js.Object
val LoopOnce: AnimationActionLoopStyles = js.native;
val LoopRepeat: AnimationActionLoopStyles = js.native;
val LoopPingPong: AnimationActionLoopStyles = js.native;

@js.native
sealed trait InterpolationModes extends js.Object
val InterpolateDiscrete: InterpolationModes = js.native;
val InterpolateLinear: InterpolationModes = js.native;
val InterpolateSmooth: InterpolationModes = js.native;

@js.native
sealed trait InterpolationEndingModes extends js.Object
val ZeroCurvatureEnding: InterpolationEndingModes = js.native;
val ZeroSlopeEnding: InterpolationEndingModes = js.native;
val WrapAroundEnding: InterpolationEndingModes = js.native;

@js.native
sealed trait AnimationBlendMode extends js.Object
val NormalAnimationBlendMode: AnimationBlendMode = js.native;
val AdditiveAnimationBlendMode: AnimationBlendMode = js.native;

@js.native
sealed trait TrianglesDrawModes extends js.Object
val TrianglesDrawMode: TrianglesDrawModes = js.native;
val TriangleStripDrawMode: TrianglesDrawModes = js.native;
val TriangleFanDrawMode: TrianglesDrawModes = js.native;

@js.native
sealed trait TextureEncoding extends js.Object
val LinearEncoding: TextureEncoding = js.native;
val sRGBEncoding: TextureEncoding = js.native;
val GammaEncoding: TextureEncoding = js.native;
val RGBEEncoding: TextureEncoding = js.native;
val LogLuvEncoding: TextureEncoding = js.native;
val RGBM7Encoding: TextureEncoding = js.native;
val RGBM16Encoding: TextureEncoding = js.native;
val RGBDEncoding: TextureEncoding = js.native;

@js.native
sealed trait DepthPackingStrategies extends js.Object
val BasicDepthPacking: DepthPackingStrategies = js.native;
val RGBADepthPacking: DepthPackingStrategies = js.native;

@js.native
sealed trait NormalMapTypes extends js.Object
val TangentSpaceNormalMap: NormalMapTypes = js.native;
val ObjectSpaceNormalMap: NormalMapTypes = js.native;

@js.native
sealed trait StencilOp extends js.Object
val ZeroStencilOp: StencilOp = js.native;
val KeepStencilOp: StencilOp = js.native;
val ReplaceStencilOp: StencilOp = js.native;
val IncrementStencilOp: StencilOp = js.native;
val DecrementStencilOp: StencilOp = js.native;
val IncrementWrapStencilOp: StencilOp = js.native;
val DecrementWrapStencilOp: StencilOp = js.native;
val InvertStencilOp: StencilOp = js.native;

@js.native
sealed trait StencilFunc extends js.Object
val NeverStencilFunc: StencilFunc = js.native;
val LessStencilFunc: StencilFunc = js.native;
val EqualStencilFunc: StencilFunc = js.native;
val LessEqualStencilFunc: StencilFunc = js.native;
val GreaterStencilFunc: StencilFunc = js.native;
val NotEqualStencilFunc: StencilFunc = js.native;
val GreaterEqualStencilFunc: StencilFunc = js.native;
val AlwaysStencilFunc: StencilFunc = js.native;

@js.native
sealed trait Usage extends js.Object
val StaticDrawUsage: Usage = js.native;
val DynamicDrawUsage: Usage = js.native;
val StreamDrawUsage: Usage = js.native;
val StaticReadUsage: Usage = js.native;
val DynamicReadUsage: Usage = js.native;
val StreamReadUsage: Usage = js.native;
val StaticCopyUsage: Usage = js.native;
val DynamicCopyUsage: Usage = js.native;
val StreamCopyUsage: Usage = js.native;

@js.native
sealed trait GLSLVersion extends js.Object
val GLSL1: GLSLVersion = js.native;
val GLSL3: GLSLVersion = js.native;

type BuiltinShaderAttributeName = "position" | "normal" | "uv" | "color" | "skinIndex" | "skinWeight" | "instanceMatrix" | "morphTarget0" | "morphTarget1" | "morphTarget2" | "morphTarget3" | "morphTarget4" | "morphTarget5" | "morphTarget6" | "morphTarget7" | "morphNormal0" | "morphNormal1" | "morphNormal2" | "morphNormal3"

object MOUSE:
	val LEFT: MOUSE = js.native;
	val MIDDLE: MOUSE = js.native;
	val RIGHT: MOUSE = js.native;
	val ROTATE: MOUSE = js.native;
	val DOLLY: MOUSE = js.native;
	val PAN: MOUSE = js.native;

object TOUCH:
	val ROTATE: TOUCH = js.native;
	val PAN: TOUCH = js.native;
	val DOLLY_PAN: TOUCH = js.native;
	val DOLLY_ROTATE: TOUCH = js.native;

type ColorRepresentation = Color | String | Double
