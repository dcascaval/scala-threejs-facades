package typings.three.three.renderers

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
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
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.WebGLMultipleRenderTargets")
class WebGLMultipleRenderTargets extends EventDispatcher:
	def this(width: Double, height: Double, count: Double) = this()
	val texture: js.Array[Texture] = js.native;
	var isWebGLMultipleRenderTargets: Boolean = js.native;
	def setSize(width: Double, height: Double, depth: js.UndefOr[Double]): this.type = js.native
	def copy(source: WebGLMultipleRenderTargets): this.type = js.native
	def clone(): this.type = js.native
	def dispose(): Unit = js.native
	def setTexture(texture: Texture): Unit = js.native

@js.native
sealed trait Renderer extends js.Object:
	val domElement: HTMLCanvasElement = js.native;
	def render(scene: Object3D, camera: Camera): Unit = js.native
	def setSize(width: Double, height: Double, updateStyle: js.UndefOr[Boolean]): Unit = js.native

@js.native
sealed trait OffscreenCanvas extends EventTarget

@js.native
sealed trait WebGLRendererParameters extends js.Object:
	val canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.native;
	val context: js.UndefOr[WebGLRenderingContext] = js.native;
	val precision: js.UndefOr[String] = js.native;
	val alpha: js.UndefOr[Boolean] = js.native;
	val premultipliedAlpha: js.UndefOr[Boolean] = js.native;
	val antialias: js.UndefOr[Boolean] = js.native;
	val stencil: js.UndefOr[Boolean] = js.native;
	val preserveDrawingBuffer: js.UndefOr[Boolean] = js.native;
	val powerPreference: js.UndefOr[String] = js.native;
	val depth: js.UndefOr[Boolean] = js.native;
	val logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native;
	val failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.native;

@js.native
sealed trait WebGLDebug extends js.Object:
	val checkShaderErrors: Boolean = js.native;

@js.native
@JSGlobal("THREE.WebGLRenderer")
class WebGLRenderer extends Renderer:
	def this(parameters: js.UndefOr[WebGLRendererParameters]) = this()
	val domElement: HTMLCanvasElement = js.native;
	val context: WebGLRenderingContext = js.native;
	val autoClear: Boolean = js.native;
	val autoClearColor: Boolean = js.native;
	val autoClearDepth: Boolean = js.native;
	val autoClearStencil: Boolean = js.native;
	val debug: WebGLDebug = js.native;
	val sortObjects: Boolean = js.native;
	val clippingPlanes: js.Array[js.Any] = js.native;
	val localClippingEnabled: Boolean = js.native;
	val extensions: WebGLExtensions = js.native;
	val outputEncoding: TextureEncoding = js.native;
	val physicallyCorrectLights: Boolean = js.native;
	val toneMapping: ToneMapping = js.native;
	val toneMappingExposure: Double = js.native;
	val info: WebGLInfo = js.native;
	val shadowMap: WebGLShadowMap = js.native;
	val pixelRatio: Double = js.native;
	val capabilities: WebGLCapabilities = js.native;
	val properties: WebGLProperties = js.native;
	val renderLists: WebGLRenderLists = js.native;
	val state: WebGLState = js.native;
	val xr: WebXRManager = js.native;
	val gammaFactor: Double = js.native;
	val vr: Boolean = js.native;
	val shadowMapEnabled: Boolean = js.native;
	val shadowMapType: ShadowMapType = js.native;
	val shadowMapCullFace: CullFace = js.native;
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
	def setSize(width: Double, height: Double, updateStyle: js.UndefOr[Boolean]): Unit = js.native
	def getCurrentViewport(target: Vector4): Vector4 = js.native
	def getViewport(target: Vector4): Vector4 = js.native
	def setViewport(x: Vector4 | Double, y: js.UndefOr[Double], width: js.UndefOr[Double], height: js.UndefOr[Double]): Unit = js.native
	def getScissor(target: Vector4): Vector4 = js.native
	def setScissor(x: Vector4 | Double, y: js.UndefOr[Double], width: js.UndefOr[Double], height: js.UndefOr[Double]): Unit = js.native
	def getScissorTest(): Boolean = js.native
	def setScissorTest(enable: Boolean): Unit = js.native
	def setOpaqueSort(method: js.Function2[js.Any,js.Any,Double]): Unit = js.native
	def setTransparentSort(method: js.Function2[js.Any,js.Any,Double]): Unit = js.native
	def getClearColor(target: Color): Color = js.native
	def setClearColor(color: ColorRepresentation, alpha: js.UndefOr[Double]): Unit = js.native
	def getClearAlpha(): Double = js.native
	def setClearAlpha(alpha: Double): Unit = js.native
	def clear(color: js.UndefOr[Boolean], depth: js.UndefOr[Boolean], stencil: js.UndefOr[Boolean]): Unit = js.native
	def clearColor(): Unit = js.native
	def clearDepth(): Unit = js.native
	def clearStencil(): Unit = js.native
	def clearTarget(renderTarget: WebGLRenderTarget, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
	def resetGLState(): Unit = js.native
	def dispose(): Unit = js.native
	def renderBufferImmediate(`object`: Object3D, program: WebGLProgram): Unit = js.native
	def renderBufferDirect(camera: Camera, scene: Scene, geometry: BufferGeometry, material: Material, `object`: Object3D, geometryGroup: js.Any): Unit = js.native
	def setAnimationLoop(callback: XRAnimationLoopCallback | Null): Unit = js.native
	def animate(callback: js.Function0[Unit]): Unit = js.native
	def compile(scene: Object3D, camera: Camera): Unit = js.native
	def render(scene: Object3D, camera: Camera): Unit = js.native
	def getActiveCubeFace(): Double = js.native
	def getActiveMipmapLevel(): Double = js.native
	def getRenderTarget(): RenderTarget | Null = js.native
	def getCurrentRenderTarget(): RenderTarget | Null = js.native
	def setRenderTarget(renderTarget: RenderTarget | Null, activeCubeFace: js.UndefOr[Double], activeMipmapLevel: js.UndefOr[Double]): Unit = js.native
	def readRenderTargetPixels(renderTarget: RenderTarget, x: Double, y: Double, width: Double, height: Double, buffer: js.Any, activeCubeFaceIndex: js.UndefOr[Double]): Unit = js.native
	def copyFramebufferToTexture(position: Vector2, texture: Texture, level: js.UndefOr[Double]): Unit = js.native
	def copyTextureToTexture(position: Vector2, srcTexture: Texture, dstTexture: Texture, level: js.UndefOr[Double]): Unit = js.native
	def copyTextureToTexture3D(sourceBox: Box3, position: Vector3, srcTexture: Texture, dstTexture: DataTexture3D | DataTexture2DArray, level: js.UndefOr[Double]): Unit = js.native
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
	def this(size: Double, options: js.UndefOr[WebGLRenderTargetOptions]) = this()
	val texture: CubeTexture = js.native;
	def fromEquirectangularTexture(renderer: WebGLRenderer, texture: Texture): this.type = js.native
	def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native

@js.native
sealed trait WebGLRenderTargetOptions extends js.Object:
	val wrapS: js.UndefOr[Wrapping] = js.native;
	val wrapT: js.UndefOr[Wrapping] = js.native;
	val magFilter: js.UndefOr[TextureFilter] = js.native;
	val minFilter: js.UndefOr[TextureFilter] = js.native;
	val format: js.UndefOr[Double] = js.native;
	val `type`: js.UndefOr[TextureDataType] = js.native;
	val anisotropy: js.UndefOr[Double] = js.native;
	val depthBuffer: js.UndefOr[Boolean] = js.native;
	val stencilBuffer: js.UndefOr[Boolean] = js.native;
	val generateMipmaps: js.UndefOr[Boolean] = js.native;
	val depthTexture: js.UndefOr[DepthTexture] = js.native;
	val encoding: js.UndefOr[TextureEncoding] = js.native;

@js.native
@JSGlobal("THREE.WebGLRenderTarget")
class WebGLRenderTarget extends EventDispatcher:
	def this(width: Double, height: Double, options: js.UndefOr[WebGLRenderTargetOptions]) = this()
	val uuid: String = js.native;
	val width: Double = js.native;
	val height: Double = js.native;
	val depth: Double = js.native;
	val scissor: Vector4 = js.native;
	val scissorTest: Boolean = js.native;
	val viewport: Vector4 = js.native;
	val texture: Texture = js.native;
	val depthBuffer: Boolean = js.native;
	val stencilBuffer: Boolean = js.native;
	val depthTexture: DepthTexture = js.native;
	var isWebGLRenderTarget: Boolean = js.native;
	val wrapS: js.Any = js.native;
	val wrapT: js.Any = js.native;
	val magFilter: js.Any = js.native;
	val minFilter: js.Any = js.native;
	val anisotropy: js.Any = js.native;
	val offset: js.Any = js.native;
	val repeat: js.Any = js.native;
	val format: js.Any = js.native;
	val `type`: js.Any = js.native;
	val generateMipmaps: js.Any = js.native;
	def setTexture(texture: Texture): Unit = js.native
	def setSize(width: Double, height: Double, depth: js.UndefOr[Double]): Unit = js.native
	def clone(): this.type = js.native
	def copy(source: WebGLRenderTarget): this.type = js.native
	def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.WebGL1Renderer")
class WebGL1Renderer extends WebGLRenderer:
	def this(parameters: js.UndefOr[WebGLRendererParameters]) = this()
	var isWebGL1Renderer: Boolean = js.native;

@js.native
@JSGlobal("THREE.WebGLMultisampleRenderTarget")
class WebGLMultisampleRenderTarget extends WebGLRenderTarget:
	def this(width: Double, height: Double, options: js.UndefOr[WebGLRenderTargetOptions]) = this()
	var isWebGLMultisampleRenderTarget: Boolean = js.native;
	val samples: Double = js.native;
