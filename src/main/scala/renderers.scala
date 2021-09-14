package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object renderers extends js.Object:
	@js.native
	class WebGLMultipleRenderTargets extends js.Object:
		val texture: js.Array[Texture] = js.native;
		var isWebGLMultipleRenderTargets: true = js.native;
		def setSize(width: Double, height: Double, depth: js.UndefOr[Double] = js.undefined): this.type = js.native
		def copy(source: WebGLMultipleRenderTargets): this.type = js.native
		def clone(): this.type = js.native
		def dispose(): Unit = js.native
		def setTexture(texture: Texture): Unit = js.native
	@js.nativetrait Renderer extends js.Object:
		val domElement: HTMLCanvasElement = js.native;
		def render(scene: Object3D, camera: Camera): Unit = js.native
		def setSize(width: Double, height: Double, updateStyle: js.UndefOr[Boolean] = js.undefined): Unit = js.native
	@js.nativetrait OffscreenCanvas extends EventTarget:
	@js.nativetrait WebGLRendererParameters extends js.Object:
		val canvas: js.UndefOr[js.UndefOr[HTMLCanvasElementOffscreenCanvas]] = js.native;
		val context: js.UndefOr[js.UndefOr[WebGLRenderingContext]] = js.native;
		val precision: js.UndefOr[js.UndefOr[String]] = js.native;
		val alpha: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val premultipliedAlpha: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val antialias: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val stencil: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val preserveDrawingBuffer: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val powerPreference: js.UndefOr[js.UndefOr[String]] = js.native;
		val depth: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val logarithmicDepthBuffer: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val failIfMajorPerformanceCaveat: js.UndefOr[js.UndefOr[Boolean]] = js.native;
	@js.nativetrait WebGLDebug extends js.Object:
		val checkShaderErrors: Boolean = js.native;
	@js.native
	class WebGLRenderer extends js.Object:
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
		def setSize(width: Double, height: Double, updateStyle: js.UndefOr[Boolean] = js.undefined): Unit = js.native
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
		def renderBufferImmediate(object: Object3D, program: WebGLProgram): Unit = js.native
		def renderBufferDirect(camera: Camera, scene: Scene, geometry: BufferGeometry, material: Material, object: Object3D, geometryGroup: js.Any): Unit = js.native
		def setAnimationLoop(callback: XRAnimationLoopCallback | null): Unit = js.native
		def animate(callback: js.Function0[,Unit]): Unit = js.native
		def compile(scene: Object3D, camera: Camera): Unit = js.native
		def render(scene: Object3D, camera: Camera): Unit = js.native
		def getActiveCubeFace(): Double = js.native
		def getActiveMipmapLevel(): Double = js.native
		def getRenderTarget(): RenderTarget | null = js.native
		def getCurrentRenderTarget(): RenderTarget | null = js.native
		def setRenderTarget(renderTarget: RenderTarget | null, activeCubeFace: js.UndefOr[Double] = js.undefined, activeMipmapLevel: js.UndefOr[Double] = js.undefined): Unit = js.native
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
	class WebGLCubeRenderTarget extends js.Object:
		val texture: CubeTexture = js.native;
		def fromEquirectangularTexture(renderer: WebGLRenderer, texture: Texture): this.type = js.native
		def clear(renderer: WebGLRenderer, color: Boolean, depth: Boolean, stencil: Boolean): Unit = js.native
	@js.nativetrait WebGLRenderTargetOptions extends js.Object:
		val wrapS: js.UndefOr[js.UndefOr[Wrapping]] = js.native;
		val wrapT: js.UndefOr[js.UndefOr[Wrapping]] = js.native;
		val magFilter: js.UndefOr[js.UndefOr[TextureFilter]] = js.native;
		val minFilter: js.UndefOr[js.UndefOr[TextureFilter]] = js.native;
		val format: js.UndefOr[js.UndefOr[Double]] = js.native;
		val type: js.UndefOr[js.UndefOr[TextureDataType]] = js.native;
		val anisotropy: js.UndefOr[js.UndefOr[Double]] = js.native;
		val depthBuffer: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val stencilBuffer: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val generateMipmaps: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		val depthTexture: js.UndefOr[js.UndefOr[DepthTexture]] = js.native;
		val encoding: js.UndefOr[js.UndefOr[TextureEncoding]] = js.native;
	@js.native
	class WebGLRenderTarget extends js.Object:
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
		var isWebGLRenderTarget: true = js.native;
		val wrapS: js.Any = js.native;
		val wrapT: js.Any = js.native;
		val magFilter: js.Any = js.native;
		val minFilter: js.Any = js.native;
		val anisotropy: js.Any = js.native;
		val offset: js.Any = js.native;
		val repeat: js.Any = js.native;
		val format: js.Any = js.native;
		val type: js.Any = js.native;
		val generateMipmaps: js.Any = js.native;
		def setTexture(texture: Texture): Unit = js.native
		def setSize(width: Double, height: Double, depth: js.UndefOr[Double] = js.undefined): Unit = js.native
		def clone(): this.type = js.native
		def copy(source: WebGLRenderTarget): this.type = js.native
		def dispose(): Unit = js.native
	
	@js.native
	JSGlobal("THREE")
	object webgl extends js.Object:
		@js.nativetrait RenderTarget extends js.Object:
		@js.nativetrait RenderItem extends js.Object:
			val id: Double = js.native;
			val object: Object3D = js.native;
			val geometry: BufferGeometry | null = js.native;
			val material: Material = js.native;
			val program: WebGLProgram = js.native;
			val groupOrder: Double = js.native;
			val renderOrder: Double = js.native;
			val z: Double = js.native;
			val group: Group | null = js.native;
		@js.native
		class WebGLRenderList extends js.Object:
			val opaque: js.Array[RenderItem] = js.native;
			val transparent: js.Array[RenderItem] = js.native;
			def init(): Unit = js.native
			def push(object: Object3D, geometry: BufferGeometry | null, material: Material, groupOrder: Double, z: Double, group: Group | null): Unit = js.native
			def unshift(object: Object3D, geometry: BufferGeometry | null, material: Material, groupOrder: Double, z: Double, group: Group | null): Unit = js.native
			def sort(opaqueSort: js.Function2[js.Any,js.Any,Double], transparentSort: js.Function2[js.Any,js.Any,Double]): Unit = js.native
			def finish(): Unit = js.native
		@js.native
		class WebGLRenderLists extends js.Object:
			def dispose(): Unit = js.native
			def get(scene: Scene, camera: Camera): WebGLRenderList = js.native
		@js.native
		class WebGLShadowMap extends js.Object:
			val enabled: Boolean = js.native;
			val autoUpdate: Boolean = js.native;
			val needsUpdate: Boolean = js.native;
			val type: ShadowMapType = js.native;
			val cullFace: js.Any = js.native;
			def render(shadowsArray: js.Array[Light], scene: Scene, camera: Camera): Unit = js.native
		@js.native
		class WebGLPrograms extends js.Object:
			val programs: js.Array[WebGLProgram] = js.native;
			def getParameters(material: Material, lights: js.Any, shadows: js.Array[js.Object], scene: Scene, object: js.Any): js.Any = js.native
			def getProgramCacheKey(parameters: js.Any): String = js.native
			def getUniforms(material: Material): js.Object = js.native
			def acquireProgram(parameters: js.Any, cacheKey: String): WebGLProgram = js.native
			def releaseProgram(program: WebGLProgram): Unit = js.native
		@js.native
		class WebGLExtensions extends js.Object:
			def has(name: String): Boolean = js.native
			def init(capabilities: WebGLCapabilities): Unit = js.native
			def get(name: String): js.Any = js.native
		@js.native
		class WebGLInfo extends js.Object:
			val autoReset: Boolean = js.native;
			val memory: objectType49 = js.native;
			val programs: js.Array[WebGLProgram] | null = js.native;
			val render: objectType50 = js.native;
			def update(count: Double, mode: Double, instanceCount: Double): Unit = js.native
			def reset(): Unit = js.native
		@js.native
		class WebGLBufferRenderer extends js.Object:
			def setMode(value: js.Any): Unit = js.native
			def render(start: js.Any, count: Double): Unit = js.native
			def renderInstances(start: js.Any, count: Double, primcount: Double): Unit = js.native
		@js.native
		class WebGLProgram extends js.Object:
			val name: String = js.native;
			val id: Double = js.native;
			val cacheKey: String = js.native;
			val usedTimes: Double = js.native;
			val program: js.Any = js.native;
			val vertexShader: WebGLShader = js.native;
			val fragmentShader: WebGLShader = js.native;
			val uniforms: js.Any = js.native;
			val attributes: js.Any = js.native;
			def getUniforms(): WebGLUniforms = js.native
			def getAttributes(): js.Any = js.native
			def destroy(): Unit = js.native
		@js.native
		class WebGLIndexedBufferRenderer extends js.Object:
			def setMode(value: js.Any): Unit = js.native
			def setIndex(index: js.Any): Unit = js.native
			def render(start: js.Any, count: Double): Unit = js.native
			def renderInstances(start: js.Any, count: Double, primcount: Double): Unit = js.native
		@js.native
		class WebGLUniforms extends js.Object:
			def setValue(gl: WebGLRenderingContext, name: String, value: js.Any, textures: WebGLTextures): Unit = js.native
			def setOptional(gl: WebGLRenderingContext, object: js.Any, name: String): Unit = js.native


		@js.native
		class WebGLBindingStates extends js.Object:
			def setup(object: Object3D, material: Material, program: WebGLProgram, geometry: BufferGeometry, index: BufferAttribute): Unit = js.native
			def reset(): Unit = js.native
			def resetDefaultState(): Unit = js.native
			def dispose(): Unit = js.native
			def releaseStatesOfGeometry(): Unit = js.native
			def releaseStatesOfProgram(): Unit = js.native
			def initAttributes(): Unit = js.native
			def enableAttribute(attribute: Double): Unit = js.native
			def disableUnusedAttributes(): Unit = js.native
		@js.native
		class WebGLProperties extends js.Object:
			def get(object: js.Any): js.Any = js.native
			def remove(object: js.Any): Unit = js.native
			def update(object: js.Any, key: js.Any, value: js.Any): js.Any = js.native
			def dispose(): Unit = js.native
		@js.native
		class WebGLUtils extends js.Object:
			def convert(p: js.Any): Unit = js.native
		def WebGLShader(gl: WebGLRenderingContext, type: String, string: String): WebGLShader = js.native
		@js.native
		class WebGLTextures extends js.Object:
			def allocateTextureUnit(): Unit = js.native
			def resetTextureUnits(): Unit = js.native
			def setTexture2D(texture: js.Any, slot: Double): Unit = js.native
			def setTexture2DArray(texture: js.Any, slot: Double): Unit = js.native
			def setTexture3D(texture: js.Any, slot: Double): Unit = js.native
			def setTextureCube(texture: js.Any, slot: Double): Unit = js.native
			def setupRenderTarget(renderTarget: js.Any): Unit = js.native
			def updateRenderTargetMipmap(renderTarget: js.Any): Unit = js.native
			def updateMultisampleRenderTarget(renderTarget: js.Any): Unit = js.native
			def safeSetTexture2D(texture: js.Any, slot: Double): Unit = js.native
			def safeSetTextureCube(texture: js.Any, slot: Double): Unit = js.native
		@js.nativetrait WebGLCapabilitiesParameters extends js.Object:
			val precision: js.UndefOr[js.UndefOr[String]] = js.native;
			val logarithmicDepthBuffer: js.UndefOr[js.UndefOr[Boolean]] = js.native;
		@js.native
		class WebGLCapabilities extends js.Object:
			var isWebGL2: Boolean = js.native;
			val precision: String = js.native;
			val logarithmicDepthBuffer: Boolean = js.native;
			val maxTextures: Double = js.native;
			val maxVertexTextures: Double = js.native;
			val maxTextureSize: Double = js.native;
			val maxCubemapSize: Double = js.native;
			val maxAttributes: Double = js.native;
			val maxVertexUniforms: Double = js.native;
			val maxVaryings: Double = js.native;
			val maxFragmentUniforms: Double = js.native;
			val vertexTextures: Boolean = js.native;
			val floatFragmentTextures: Boolean = js.native;
			val floatVertexTextures: Boolean = js.native;
			def getMaxAnisotropy(): Double = js.native
			def getMaxPrecision(precision: String): String = js.native
		@js.native
		class WebGLGeometries extends js.Object:
			def get(object: Object3D, geometry: BufferGeometry): BufferGeometry = js.native
			def update(geometry: BufferGeometry): Unit = js.native
			def getWireframeAttribute(geometry: BufferGeometry): BufferAttribute = js.native
		@js.native
		class WebGLClipping extends js.Object:
			val uniform: objectType51 = js.native;
			val numPlanes: Double = js.native;
			val numIntersection: Double = js.native;
			def init(planes: js.Array[js.Any], enableLocalClipping: Boolean, camera: Camera): Boolean = js.native
			def beginShadows(): Unit = js.native
			def endShadows(): Unit = js.native
			def setState(material: Material, camera: Camera, useCache: Boolean): Unit = js.native
		@js.native
		class WebGLLights extends js.Object:
			val state: objectType52 = js.native;
			def get(light: js.Any): js.Any = js.native
			def setup(lights: js.Any): Unit = js.native
			def setupView(lights: js.Any, camera: js.Any): Unit = js.native
		@js.native
		class WebGLAttributes extends js.Object:
			def get(attribute: BufferAttribute | InterleavedBufferAttribute): objectType53 = js.native
			def remove(attribute: BufferAttribute | InterleavedBufferAttribute): Unit = js.native
			def update(attribute: BufferAttribute | InterleavedBufferAttribute, bufferType: Double): Unit = js.native
		@js.native
		class WebGLCubeUVMaps extends js.Object:
			def get[T <: Texture}](texture: T): T = js.native
			def dispose(): Unit = js.native
		@js.native
		class WebGLColorBuffer extends js.Object:
			def setMask(colorMask: Boolean): Unit = js.native
			def setLocked(lock: Boolean): Unit = js.native
			def setClear(r: Double, g: Double, b: Double, a: Double, premultipliedAlpha: Boolean): Unit = js.native
			def reset(): Unit = js.native
		@js.native
		class WebGLDepthBuffer extends js.Object:
			def setTest(depthTest: Boolean): Unit = js.native
			def setMask(depthMask: Boolean): Unit = js.native
			def setFunc(depthFunc: DepthModes): Unit = js.native
			def setLocked(lock: Boolean): Unit = js.native
			def setClear(depth: Double): Unit = js.native
			def reset(): Unit = js.native
		@js.native
		class WebGLStencilBuffer extends js.Object:
			def setTest(stencilTest: Boolean): Unit = js.native
			def setMask(stencilMask: Double): Unit = js.native
			def setFunc(stencilFunc: Double, stencilRef: Double, stencilMask: Double): Unit = js.native
			def setOp(stencilFail: Double, stencilZFail: Double, stencilZPass: Double): Unit = js.native
			def setLocked(lock: Boolean): Unit = js.native
			def setClear(stencil: Double): Unit = js.native
			def reset(): Unit = js.native
		@js.native
		class WebGLState extends js.Object:
			val buffers: objectType54 = js.native;
			def initAttributes(): Unit = js.native
			def enableAttribute(attribute: Double): Unit = js.native
			def enableAttributeAndDivisor(attribute: Double, meshPerAttribute: Double): Unit = js.native
			def disableUnusedAttributes(): Unit = js.native
			def vertexAttribPointer(index: Double, size: Double, type: Double, normalized: Boolean, stride: Double, offset: Double): Unit = js.native
			def enable(id: Double): Unit = js.native
			def disable(id: Double): Unit = js.native
			def bindFramebuffer(target: Double, framebuffer: WebGLFramebuffer | null): Unit = js.native
			def bindXRFramebuffer(framebuffer: WebGLFramebuffer | null): Unit = js.native
			def useProgram(program: js.Any): Boolean = js.native
			def setBlending(blending: Blending, blendEquation: js.UndefOr[BlendingEquation] = js.undefined, blendSrc: js.UndefOr[BlendingSrcFactor] = js.undefined, blendDst: js.UndefOr[BlendingDstFactor] = js.undefined, blendEquationAlpha: js.UndefOr[BlendingEquation] = js.undefined, blendSrcAlpha: js.UndefOr[BlendingSrcFactor] = js.undefined, blendDstAlpha: js.UndefOr[BlendingDstFactor] = js.undefined, premultiplyAlpha: js.UndefOr[Boolean] = js.undefined): Unit = js.native
			def setMaterial(material: Material, frontFaceCW: Boolean): Unit = js.native
			def setFlipSided(flipSided: Boolean): Unit = js.native
			def setCullFace(cullFace: CullFace): Unit = js.native
			def setLineWidth(width: Double): Unit = js.native
			def setPolygonOffset(polygonoffset: Boolean, factor: js.UndefOr[Double] = js.undefined, units: js.UndefOr[Double] = js.undefined): Unit = js.native
			def setScissorTest(scissorTest: Boolean): Unit = js.native
			def activeTexture(webglSlot: Double): Unit = js.native
			def bindTexture(webglType: Double, webglTexture: js.Any): Unit = js.native
			def unbindTexture(): Unit = js.native
			def compressedTexImage2D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, border: Double, data: ArrayBufferView): Unit = js.native
			def texImage2D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, border: Double, format: Double, type: Double, pixels: ArrayBufferView | null): Unit = js.native
			def texImage2D(target: Double, level: Double, internalformat: Double, format: Double, type: Double, source: js.Any): Unit = js.native
			def texImage3D(target: Double, level: Double, internalformat: Double, width: Double, height: Double, depth: Double, border: Double, format: Double, type: Double, pixels: js.Any): Unit = js.native
			def scissor(scissor: Vector4): Unit = js.native
			def viewport(viewport: Vector4): Unit = js.native
			def reset(): Unit = js.native
		@js.native
		class WebGLCubeMaps extends js.Object:
			def get(texture: js.Any): js.Any = js.native
			def dispose(): Unit = js.native
		@js.native
		class WebGLObjects extends js.Object:
			def update(object: js.Any): js.Any = js.native
			def dispose(): Unit = js.native
	
	@js.native
	JSGlobal("THREE")
	object webxr extends js.Object:
		type XRControllerEventType = XREventType | "disconnected" | "connected"
		@js.native
		class WebXRController extends js.Object:
			def getTargetRaySpace(): Group = js.native
			def getGripSpace(): Group = js.native
			def dispatchEvent(event: objectType55): this.type = js.native
			def disconnect(inputSource: XRInputSource): this.type = js.native
			def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native
		@js.native
		class WebXRManager extends js.Object:
			val enabled: Boolean = js.native;
			val isPresenting: Boolean = js.native;
			def getController(index: Double): Group = js.native
			def getControllerGrip(index: Double): Group = js.native
			def getHand(index: Double): Group = js.native
			def setFramebufferScaleFactor(value: Double): Unit = js.native
			def setReferenceSpaceType(value: XRReferenceSpaceType): Unit = js.native
			def getReferenceSpace(): XRReferenceSpace | null = js.native
			def getSession(): XRSession | null = js.native
			def setSession(value: XRSession): Promise[Unit] = js.native
			def getCamera(camera: Camera): Camera = js.native
			def setAnimationLoop(callback: XRFrameRequestCallback): Unit = js.native
			def getFoveation(): js.UndefOr[Double] = js.native
			def setFoveation(foveation: Double): Unit = js.native
			def dispose(): Unit = js.native
		type XRSessionMode = "inline" | "immersive-vr" | "immersive-ar"
		type XRReferenceSpaceType = "viewer" | "local" | "local-floor" | "bounded-floor" | "unbounded"
		type XREnvironmentBlendMode = "opaque" | "additive" | "alpha-blend"
		type XRVisibilityState = "visible" | "visible-blurred" | "hidden"
		type XRHandedness = "none" | "left" | "right"
		type XRTargetRayMode = "gaze" | "tracked-pointer" | "screen"
		type XREye = "none" | "left" | "right"
		type XREventType = "end" | "select" | "selectstart" | "selectend" | "squeeze" | "squeezestart" | "squeezeend" | "inputsourceschange"
		type XRAnimationLoopCallback = js.Function2[Double,XRFrame,Unit]
		type XRFrameRequestCallback = js.Function2[Double,XRFrame,Unit]
		@js.nativetrait XR extends EventTarget:
			def requestSession(mode: XRSessionMode, options: js.UndefOr[XRSessionInit] = js.undefined): Promise[XRSession] = js.native
			def isSessionSupported(mode: XRSessionMode): Promise[Boolean] = js.native
		@js.nativetrait Window extends js.Object:
			val XRSession: js.UndefOr[js.UndefOr[Constructor[XRSession]]] = js.native;
			val XR: js.UndefOr[js.UndefOr[Constructor[XR]]] = js.native;
		@js.nativetrait Navigator extends js.Object:
			val xr: js.UndefOr[js.UndefOr[XR]] = js.native;
		@js.nativetrait XRReferenceSpace extends EventTarget:
			def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
		@js.nativetrait XRHitTestOptionsInit extends js.Object:
			val space: EventTarget = js.native;
			val offsetRay: js.UndefOr[js.UndefOr[XRRay]] = js.native;
		@js.nativetrait XRTransientInputHitTestOptionsInit extends js.Object:
			val profile: String = js.native;
			val offsetRay: js.UndefOr[js.UndefOr[XRRay]] = js.native;
		@js.nativetrait XRViewport extends js.Object:
			var x: Double = js.native;
			var y: Double = js.native;
			var width: Double = js.native;
			var height: Double = js.native;
		@js.nativetrait WebGLRenderingContext extends js.Object:
			def makeXRCompatible(): Promise[Unit] = js.native
		@js.nativetrait XRRenderState extends js.Object:
			var depthNear: Double = js.native;
			var depthFar: Double = js.native;
			var inlineVerticalFieldOfView: js.UndefOr[js.UndefOr[Double]] = js.native;
			var baseLayer: js.UndefOr[js.UndefOr[XRWebGLLayer]] = js.native;
		@js.nativetrait XRRenderStateInit extends js.Object:
			val depthNear: js.UndefOr[js.UndefOr[Double]] = js.native;
			val depthFar: js.UndefOr[js.UndefOr[Double]] = js.native;
			val inlineVerticalFieldOfView: js.UndefOr[js.UndefOr[Double]] = js.native;
			val baseLayer: js.UndefOr[js.UndefOr[XRWebGLLayer]] = js.native;
		@js.nativetrait XRGamepad extends js.Object:
			var id: String = js.native;
			var index: Double = js.native;
			var connected: Boolean = js.native;
			var timestamp: DOMHighResTimeStamp = js.native;
			var mapping: GamepadMappingType = js.native;
			var axes: Float32Array = js.native;
			var buttons: js.Array[GamepadButton] = js.native;
		@js.nativetrait XRInputSource extends js.Object:
			var handedness: XRHandedness = js.native;
			var targetRayMode: XRTargetRayMode = js.native;
			var targetRaySpace: EventTarget = js.native;
			var gripSpace: js.UndefOr[js.UndefOr[EventTarget]] = js.native;
			var profiles: js.Array[String] = js.native;
			var gamepad: XRGamepad = js.native;
			var hand: js.UndefOr[js.UndefOr[XRHand]] = js.native;
		@js.nativetrait XRSessionInit extends js.Object:
			val optionalFeatures: js.UndefOr[js.UndefOr[js.Array[String]]] = js.native;
			val requiredFeatures: js.UndefOr[js.UndefOr[js.Array[String]]] = js.native;
		@js.nativetrait XRSession extends EventTarget:
			def requestReferenceSpace(type: XRReferenceSpaceType): Promise[XRReferenceSpace] = js.native
			def updateRenderState(renderStateInit: XRRenderStateInit): Promise[Unit] = js.native
			def requestAnimationFrame(callback: XRFrameRequestCallback): Double = js.native
			def cancelAnimationFrame(id: Double): Unit = js.native
			def end(): Promise[Unit] = js.native
			val renderState: XRRenderState = js.native;
			val inputSources: js.Array[XRInputSource] = js.native;
			val environmentBlendMode: XREnvironmentBlendMode = js.native;
			val visibilityState: XRVisibilityState = js.native;
			def requestHitTestSource(options: XRHitTestOptionsInit): Promise[XRHitTestSource] = js.native
			def requestHitTestSourceForTransientInput(options: XRTransientInputHitTestOptionsInit): Promise[XRTransientInputHitTestSource] = js.native
			def requestHitTest(ray: XRRay, referenceSpace: XRReferenceSpace): Promise[js.Array[XRHitResult]] = js.native
			def updateWorldTrackingState(options: objectType56): Unit = js.native
		@js.nativetrait XRReferenceSpace extends EventTarget:
			def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
			val onreset: js.Any = js.native;
		type XRPlaneSet = Set[XRPlane]
		type XRAnchorSet = Set[XRAnchor]
		@js.nativetrait XRFrame extends js.Object:
			var session: XRSession = js.native;
			def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
			def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
			def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
			def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
			val trackedAnchors: js.UndefOr[js.UndefOr[XRAnchorSet]] = js.native;
			def createAnchor(pose: XRRigidTransform, space: EventTarget): Promise[XRAnchor] = js.native
			val worldInformation: objectType57 = js.native;
			def getJointPose(joint: XRJointSpace, baseSpace: EventTarget): XRJointPose = js.native
		@js.nativetrait XRViewerPose extends js.Object:
			var transform: XRRigidTransform = js.native;
			var views: js.Array[XRView] = js.native;
		@js.nativetrait XRPose extends js.Object:
			var emulatedPosition: Boolean = js.native;
			var transform: XRRigidTransform = js.native;
		@js.nativetrait XRWebGLLayerInit extends js.Object:
			val antialias: js.UndefOr[js.UndefOr[Boolean]] = js.native;
			val depth: js.UndefOr[js.UndefOr[Boolean]] = js.native;
			val stencil: js.UndefOr[js.UndefOr[Boolean]] = js.native;
			val alpha: js.UndefOr[js.UndefOr[Boolean]] = js.native;
			val ignoreDepthValues: js.UndefOr[js.UndefOr[Boolean]] = js.native;
			val framebufferScaleFactor: js.UndefOr[js.UndefOr[Double]] = js.native;
		@js.native
		class XRWebGLLayer extends js.Object:
			val framebuffer: WebGLFramebuffer = js.native;
			val framebufferWidth: Double = js.native;
			val framebufferHeight: Double = js.native;
			def getViewport(view: XRView): XRViewport = js.native
		@js.nativetrait DOMPointInit extends js.Object:
			val w: js.UndefOr[js.UndefOr[Double]] = js.native;
			val x: js.UndefOr[js.UndefOr[Double]] = js.native;
			val y: js.UndefOr[js.UndefOr[Double]] = js.native;
			val z: js.UndefOr[js.UndefOr[Double]] = js.native;
		@js.native
		class XRRigidTransform extends js.Object:
			val position: DOMPointReadOnly = js.native;
			val orientation: DOMPointReadOnly = js.native;
			val matrix: Float32Array = js.native;
			val inverse: XRRigidTransform = js.native;
		@js.nativetrait XRView extends js.Object:
			var eye: XREye = js.native;
			var projectionMatrix: Float32Array = js.native;
			var viewMatrix: Float32Array = js.native;
			var transform: XRRigidTransform = js.native;
		@js.nativetrait XRRayDirectionInit extends js.Object:
			val x: js.UndefOr[js.UndefOr[Double]] = js.native;
			val y: js.UndefOr[js.UndefOr[Double]] = js.native;
			val z: js.UndefOr[js.UndefOr[Double]] = js.native;
			val w: js.UndefOr[js.UndefOr[Double]] = js.native;
		@js.native
		class XRRay extends js.Object:
			var origin: DOMPointReadOnly = js.native;
			var direction: XRRayDirectionInit = js.native;
			val matrix: Float32Array = js.native;
		type XRHitTestTrackableType = "point" | "plane" | "mesh"
		@js.nativetrait XRHitResult extends js.Object:
			val hitMatrix: Float32Array = js.native;
		@js.nativetrait XRTransientInputHitTestResult extends js.Object:
			var inputSource: XRInputSource = js.native;
			var results: js.Array[XRHitTestResult] = js.native;
		@js.nativetrait XRHitTestResult extends js.Object:
			def getPose(baseSpace: EventTarget): js.UndefOr[XRPosenull] = js.native
			def createAnchor(pose: XRRigidTransform): Promise[XRAnchor] = js.native
		@js.nativetrait XRHitTestSource extends js.Object:
			def cancel(): Unit = js.native
		@js.nativetrait XRTransientInputHitTestSource extends js.Object:
			def cancel(): Unit = js.native
		@js.nativetrait XRHitTestOptionsInit extends js.Object:
			val space: EventTarget = js.native;
			val entityTypes: js.UndefOr[js.UndefOr[js.Array[XRHitTestTrackableType]]] = js.native;
			val offsetRay: js.UndefOr[js.UndefOr[XRRay]] = js.native;
		@js.nativetrait XRTransientInputHitTestOptionsInit extends js.Object:
			val profile: String = js.native;
			val entityTypes: js.UndefOr[js.UndefOr[js.Array[XRHitTestTrackableType]]] = js.native;
			val offsetRay: js.UndefOr[js.UndefOr[XRRay]] = js.native;
		@js.nativetrait XRAnchor extends js.Object:
			val anchorSpace: EventTarget = js.native;
			def delete(): Unit = js.native
		@js.nativetrait XRPlane extends js.Object:
			val orientation: "Horizontal" | "Vertical" = js.native;
			val planeSpace: EventTarget = js.native;
			val polygon: js.Array[DOMPointReadOnly] = js.native;
			val lastChangedTime: Double = js.native;
		type XRHandJoint = "wrist" | "thumb-metacarpal" | "thumb-phalanx-proximal" | "thumb-phalanx-distal" | "thumb-tip" | "index-finger-metacarpal" | "index-finger-phalanx-proximal" | "index-finger-phalanx-intermediate" | "index-finger-phalanx-distal" | "index-finger-tip" | "middle-finger-metacarpal" | "middle-finger-phalanx-proximal" | "middle-finger-phalanx-intermediate" | "middle-finger-phalanx-distal" | "middle-finger-tip" | "ring-finger-metacarpal" | "ring-finger-phalanx-proximal" | "ring-finger-phalanx-intermediate" | "ring-finger-phalanx-distal" | "ring-finger-tip" | "pinky-finger-metacarpal" | "pinky-finger-phalanx-proximal" | "pinky-finger-phalanx-intermediate" | "pinky-finger-phalanx-distal" | "pinky-finger-tip"
		@js.nativetrait XRJointSpace extends EventTarget:
			var jointName: XRHandJoint = js.native;
		@js.nativetrait XRJointPose extends XRPose:
			var radius: js.UndefOr[Double] = js.native;
		@js.nativetrait XRHand extends Map[XRHandJoint,XRJointSpace]:
			var size: Double = js.native;
		@js.nativetrait Constructor[T] extends js.Object:
			def new(List(), a, r, g, s,  , :,  , (, j, s, ., A, r, r, a, y, [, j, s, ., A, n, y, ], ), *): T = js.native
			val prototype: T = js.native;
		@js.nativetrait XRInputSourceChangeEvent extends js.Object:
			val session: XRSession = js.native;
			val removed: js.Array[XRInputSource] = js.native;
			val added: js.Array[XRInputSource] = js.native;
		@js.nativetrait XRInputSourceEvent extends Event:
			var frame: XRFrame = js.native;
			var inputSource: XRInputSource = js.native;
	@js.native
	class WebGL1Renderer extends js.Object:
		var isWebGL1Renderer: true = js.native;
	
	@js.native
	JSGlobal("THREE")
	object shaders extends js.Object:
		@js.nativetrait Shader extends js.Object:
			val uniforms: objectType23 = js.native;
			val vertexShader: String = js.native;
			val fragmentShader: String = js.native;
		val ShaderLib: objectType58 = js.native;
		val ShaderChunk: objectType59 = js.native;
		def cloneUniforms(uniforms_src: js.Any): js.Any = js.native
		def mergeUniforms(uniforms: js.Array[js.Any]): js.Any = js.native
		
		@js.native
		JSGlobal("UniformsUtils")
		object UniformsUtils extends js.Object
		@js.nativetrait IUniform[TValue] extends js.Object:
			val value: TValue = js.native;
		val UniformsLib: objectType60 = js.native;
	@js.native
	class WebGLMultisampleRenderTarget extends js.Object:
		var isWebGLMultisampleRenderTarget: true = js.native;
		val samples: Double = js.native;
