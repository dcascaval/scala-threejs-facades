package typings.three.renderers

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLElement, HTMLDocument, HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
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
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


@js.native
@JSGlobal("THREE.WebGLMultipleRenderTargets")
class WebGLMultipleRenderTargets extends EventDispatcher:
	def this(width: Double, height: Double, count: Double) = this()
	var texture: js.Array[Texture] = js.native
	val isWebGLMultipleRenderTargets: Boolean = js.native
	def setSize(width: Double, height: Double, depth: js.UndefOr[Double] = js.undefined): this.type = js.native
	def copy(source: WebGLMultipleRenderTargets): this.type = js.native
	@JSName("clone")
	def jsClone(): this.type = js.native
	def dispose(): Unit = js.native
	def setTexture(texture: Texture): Unit = js.native

@js.native
trait Renderer extends js.Object:
	var domElement: HTMLCanvasElement = js.native
	def render(scene: Object3D, camera: Camera): Unit = js.native
	def setSize(width: Double, height: Double, updateStyle: js.UndefOr[Boolean] = js.undefined): Unit = js.native

@js.native
trait OffscreenCanvas extends EventTarget


trait WebGLRendererParameters extends js.Object:
	var canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.undefined
	var context: js.UndefOr[WebGLRenderingContext] = js.undefined
	var precision: js.UndefOr[String] = js.undefined
	var alpha: js.UndefOr[Boolean] = js.undefined
	var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
	var antialias: js.UndefOr[Boolean] = js.undefined
	var stencil: js.UndefOr[Boolean] = js.undefined
	var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
	var powerPreference: js.UndefOr[String] = js.undefined
	var depth: js.UndefOr[Boolean] = js.undefined
	var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined
	var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined

@js.native
trait WebGLDebug extends js.Object:
	var checkShaderErrors: Boolean = js.native

@js.native
@JSGlobal("THREE.WebGLRenderer")
class WebGLRenderer extends Renderer:
	def this(parameters: WebGLRendererParameters) = this()

	var context: WebGLRenderingContext = js.native
	var autoClear: Boolean = js.native
	var autoClearColor: Boolean = js.native
	var autoClearDepth: Boolean = js.native
	var autoClearStencil: Boolean = js.native
	var debug: WebGLDebug = js.native
	var sortObjects: Boolean = js.native
	var clippingPlanes: js.Array[js.Any] = js.native
	var localClippingEnabled: Boolean = js.native
	var extensions: WebGLExtensions = js.native
	var outputEncoding: TextureEncoding = js.native
	var physicallyCorrectLights: Boolean = js.native
	var toneMapping: ToneMapping = js.native
	var toneMappingExposure: Double = js.native
	var info: WebGLInfo = js.native
	var shadowMap: WebGLShadowMap = js.native
	var pixelRatio: Double = js.native
	var capabilities: WebGLCapabilities = js.native
	var properties: WebGLProperties = js.native
	var renderLists: WebGLRenderLists = js.native
	var state: WebGLState = js.native
	var xr: WebXRManager = js.native
	var gammaFactor: Double = js.native
	var vr: Boolean = js.native
	var shadowMapEnabled: Boolean = js.native
	var shadowMapType: ShadowMapType = js.native
	var shadowMapCullFace: CullFace = js.native
	def getContext(): WebGLRenderingContext = js.native
	def getContextAttributes(): js.Any = js.native
	def forceContextLoss(): Unit = js.native
	def getMaxAnisotropy(): Double = js.native
	def getPrecision(): String = js.native
	def getPixelRatio(): Double = js.native
	def setPixelRatio(value: Double): Unit = js.native
	def getDrawingBufferSize(target: Vector2): Vector2 = js.native
	def setDrawingBufferSize(width: Double, height: Double, pixelRatio: Double): Unit = js.native
	def getSize(target: Vector2): Vector2 = js.native

	def getCurrentViewport(target: Vector4): Vector4 = js.native
	def getViewport(target: Vector4): Vector4 = js.native
	def setViewport(x: Vector4 | Double, y: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined): Unit = js.native
	def getScissor(target: Vector4): Vector4 = js.native
	def setScissor(x: Vector4 | Double, y: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined): Unit = js.native
	def getScissorTest(): Boolean = js.native
	def setScissorTest(enable: Boolean): Unit = js.native
	def setOpaqueSort(method: js.Function2[js.Any,js.Any,Double]): Unit = js.native
	def setTransparentSort(method: js.Function2[js.Any,js.Any,Double]): Unit = js.native
	def getClearColor(target: Color): Color = js.native
	def setClearColor(color: ColorRepresentation, alpha: js.UndefOr[Double] = js.undefined): Unit = js.native
	def getClearAlpha(): Double = js.native
	def setClearAlpha(alpha: Double): Unit = js.native
	def clear(color: js.UndefOr[Boolean] = js.undefined, depth: js.UndefOr[Boolean] = js.undefined, stencil: js.UndefOr[Boolean] = js.undefined): Unit = js.native
	def clearColor(): Unit = js.native
	def clearDepth(): Unit = js.native
	def clearStencil(): Unit = js.native
	def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
	def resetGLState(): Unit = js.native
	def dispose(): Unit = js.native
	def renderBufferImmediate(`object`: Object3D, program: WebGLProgram): Unit = js.native
	def renderBufferDirect(camera: Camera, scene: Scene, geometry: BufferGeometry, material: Material, `object`: Object3D, geometryGroup: js.Any): Unit = js.native
	def setAnimationLoop(callback: XRAnimationLoopCallback): Unit = js.native
	def animate(callback: js.Function0[Unit]): Unit = js.native
	def compile(scene: Object3D, camera: Camera): Unit = js.native

	def getActiveCubeFace(): Double = js.native
	def getActiveMipmapLevel(): Double = js.native
	def getRenderTarget(): RenderTarget = js.native
	def getCurrentRenderTarget(): RenderTarget = js.native
	def setRenderTarget(renderTarget: RenderTarget, activeCubeFace: js.UndefOr[Double] = js.undefined, activeMipmapLevel: js.UndefOr[Double] = js.undefined): Unit = js.native
	def readRenderTargetPixels(renderTarget: RenderTarget, x: Double, y: Double, width: Double, height: Double, buffer: js.Any, activeCubeFaceIndex: js.UndefOr[Double] = js.undefined): Unit = js.native
	def copyFramebufferToTexture(position: Vector2, texture: Texture, level: js.UndefOr[Double] = js.undefined): Unit = js.native
	def copyTextureToTexture(position: Vector2, srcTexture: Texture, dstTexture: Texture, level: js.UndefOr[Double] = js.undefined): Unit = js.native
	def copyTextureToTexture3D(sourceBox: Box3, position: Vector3, srcTexture: Texture, dstTexture: DataTexture3D | DataTexture2DArray, level: js.UndefOr[Double] = js.undefined): Unit = js.native
	def initTexture(texture: Texture): Unit = js.native
	def resetState(): Unit = js.native
	def supportsFloatTextures(): js.Any = js.native
	def supportsHalfFloatTextures(): js.Any = js.native
	def supportsStandardDerivatives(): js.Any = js.native
	def supportsCompressedTextureS3TC(): js.Any = js.native
	def supportsCompressedTexturePVRTC(): js.Any = js.native
	def supportsBlendMinMax(): js.Any = js.native
	def supportsVertexTextures(): js.Any = js.native
	def supportsInstancedArrays(): js.Any = js.native
	def enableScissorTest(boolean: js.Any): js.Any = js.native

@js.native
@JSGlobal("THREE.WebGLCubeRenderTarget")
class WebGLCubeRenderTarget extends WebGLRenderTarget:
	def this(size: Double, options: js.UndefOr[WebGLRenderTargetOptions] = js.undefined) = this()

	def fromEquirectangularTexture(renderer: WebGLRenderer, texture: Texture): this.type = js.native
	def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native

@js.native
trait WebGLRenderTargetOptions extends js.Object:
	var wrapS: js.UndefOr[Wrapping] = js.native
	var wrapT: js.UndefOr[Wrapping] = js.native
	var magFilter: js.UndefOr[TextureFilter] = js.native
	var minFilter: js.UndefOr[TextureFilter] = js.native
	var format: js.UndefOr[Double] = js.native
	var `type`: js.UndefOr[TextureDataType] = js.native
	var anisotropy: js.UndefOr[Double] = js.native
	var depthBuffer: js.UndefOr[Boolean] = js.native
	var stencilBuffer: js.UndefOr[Boolean] = js.native
	var generateMipmaps: js.UndefOr[Boolean] = js.native
	var depthTexture: js.UndefOr[DepthTexture] = js.native
	var encoding: js.UndefOr[TextureEncoding] = js.native

@js.native
@JSGlobal("THREE.WebGLRenderTarget")
class WebGLRenderTarget extends EventDispatcher:
	def this(width: Double, height: Double, options: js.UndefOr[WebGLRenderTargetOptions] = js.undefined) = this()
	var uuid: String = js.native
	var width: Double = js.native
	var height: Double = js.native
	var depth: Double = js.native
	var scissor: Vector4 = js.native
	var scissorTest: Boolean = js.native
	var viewport: Vector4 = js.native
	var texture: Texture = js.native
	var depthBuffer: Boolean = js.native
	var stencilBuffer: Boolean = js.native
	var depthTexture: DepthTexture = js.native
	val isWebGLRenderTarget: Boolean = js.native
	var wrapS: js.Any = js.native
	var wrapT: js.Any = js.native
	var magFilter: js.Any = js.native
	var minFilter: js.Any = js.native
	var anisotropy: js.Any = js.native
	var offset: js.Any = js.native
	var repeat: js.Any = js.native
	var format: js.Any = js.native
	var `type`: js.Any = js.native
	var generateMipmaps: js.Any = js.native
	def setTexture(texture: Texture): Unit = js.native
	def setSize(width: Double, height: Double, depth: js.UndefOr[Double] = js.undefined): Unit = js.native
	@JSName("clone")
	def jsClone(): this.type = js.native
	def copy(source: WebGLRenderTarget): this.type = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGL1Renderer")
class WebGL1Renderer extends WebGLRenderer:
	def this(parameters: WebGLRendererParameters) = this()
	val isWebGL1Renderer: Boolean = js.native

@js.native
@JSGlobal("THREE.WebGLMultisampleRenderTarget")
class WebGLMultisampleRenderTarget extends WebGLRenderTarget:
	def this(width: Double, height: Double, options: js.UndefOr[WebGLRenderTargetOptions] = js.undefined) = this()
	val isWebGLMultisampleRenderTarget: Boolean = js.native
	var samples: Double = js.native
