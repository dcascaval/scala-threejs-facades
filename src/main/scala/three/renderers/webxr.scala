package typings.three.renderers.webxr

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
import typings.three.renderers.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*


type XRControllerEventType = XREventType | "disconnected" | "connected"

@js.native
@JSImport("three","WebXRController")
class WebXRController extends js.Object:
	def getTargetRaySpace(): Group = js.native
	def getGripSpace(): Group = js.native
	def dispatchEvent(event: AnonObject35): this.type = js.native
	def disconnect(inputSource: XRInputSource): this.type = js.native
	def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native

@js.native
@JSImport("three","WebXRManager")
class WebXRManager extends EventDispatcher:
	def this(renderer: js.Any, gl: WebGLRenderingContext) = this()
	var enabled: Boolean = js.native
	var isPresenting: Boolean = js.native
	def getController(index: Double): Group = js.native
	def getControllerGrip(index: Double): Group = js.native
	def getHand(index: Double): Group = js.native
	def setFramebufferScaleFactor(value: Double): Unit = js.native
	def setReferenceSpaceType(value: XRReferenceSpaceType): Unit = js.native
	def getReferenceSpace(): XRReferenceSpace = js.native
	def getSession(): XRSession = js.native
	def setSession(value: XRSession): js.Promise[Unit] = js.native
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

@js.native
trait XR extends EventTarget:
	def requestSession(mode: XRSessionMode, options: js.UndefOr[XRSessionInit] = js.undefined): js.Promise[XRSession] = js.native
	def isSessionSupported(mode: XRSessionMode): js.Promise[Boolean] = js.native

@js.native
trait Window extends js.Object:
	var XRSession: js.UndefOr[Constructor[XRSession]] = js.native
	var XR: js.UndefOr[Constructor[XR]] = js.native

@js.native
trait Navigator extends js.Object:
	var xr: js.UndefOr[XR] = js.native

@js.native
trait XRViewport extends js.Object:
	val x: Double = js.native
	val y: Double = js.native
	val width: Double = js.native
	val height: Double = js.native

@js.native
trait WebGLRenderingContext extends js.Object:
	def makeXRCompatible(): js.Promise[Unit] = js.native

@js.native
trait XRRenderState extends js.Object:
	val depthNear: Double = js.native
	val depthFar: Double = js.native
	val inlineVerticalFieldOfView: js.UndefOr[Double] = js.native
	val baseLayer: js.UndefOr[XRWebGLLayer] = js.native

@js.native
trait XRRenderStateInit extends js.Object:
	var depthNear: js.UndefOr[Double] = js.native
	var depthFar: js.UndefOr[Double] = js.native
	var inlineVerticalFieldOfView: js.UndefOr[Double] = js.native
	var baseLayer: js.UndefOr[XRWebGLLayer] = js.native

@js.native
trait XRGamepad extends js.Object:
	val id: String = js.native
	val index: Double = js.native
	val connected: Boolean = js.native
	val timestamp: DOMHighResTimeStamp = js.native
	val mapping: GamepadMappingType = js.native
	val axes: Float32Array = js.native
	val buttons: js.Array[GamepadButton] = js.native

@js.native
trait XRInputSource extends js.Object:
	val handedness: XRHandedness = js.native
	val targetRayMode: XRTargetRayMode = js.native
	val targetRaySpace: EventTarget = js.native
	val gripSpace: js.UndefOr[EventTarget] = js.native
	val profiles: js.Array[String] = js.native
	val gamepad: XRGamepad = js.native
	val hand: js.UndefOr[XRHand] = js.native

@js.native
trait XRSessionInit extends js.Object:
	var optionalFeatures: js.UndefOr[js.Array[String]] = js.native
	var requiredFeatures: js.UndefOr[js.Array[String]] = js.native

@js.native
trait XRSession extends EventTarget:
	def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace] = js.native
	def updateRenderState(renderStateInit: XRRenderStateInit): js.Promise[Unit] = js.native
	def requestAnimationFrame(callback: XRFrameRequestCallback): Double = js.native
	def cancelAnimationFrame(id: Double): Unit = js.native
	def end(): js.Promise[Unit] = js.native
	var renderState: XRRenderState = js.native
	var inputSources: js.Array[XRInputSource] = js.native
	var environmentBlendMode: XREnvironmentBlendMode = js.native
	var visibilityState: XRVisibilityState = js.native
	def requestHitTestSource(options: XRHitTestOptionsInit): js.Promise[XRHitTestSource] = js.native
	def requestHitTestSourceForTransientInput(options: XRTransientInputHitTestOptionsInit): js.Promise[XRTransientInputHitTestSource] = js.native
	def requestHitTest(ray: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] = js.native
	def updateWorldTrackingState(options: AnonObject36): Unit = js.native

@js.native
trait XRReferenceSpace extends EventTarget:
	def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
	var onreset: js.Any = js.native

type XRPlaneSet = Set[XRPlane]

type XRAnchorSet = Set[XRAnchor]

@js.native
trait XRFrame extends js.Object:
	val session: XRSession = js.native
	def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
	def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
	def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
	def getHitTestResultsForTransientInput(hitTestSource: XRTransientInputHitTestSource): js.Array[XRTransientInputHitTestResult] = js.native
	var trackedAnchors: js.UndefOr[XRAnchorSet] = js.native
	def createAnchor(pose: XRRigidTransform, space: EventTarget): js.Promise[XRAnchor] = js.native
	var worldInformation: AnonObject37 = js.native
	def getJointPose(joint: XRJointSpace, baseSpace: EventTarget): XRJointPose = js.native

@js.native
trait XRViewerPose extends js.Object:
	val transform: XRRigidTransform = js.native
	val views: js.Array[XRView] = js.native

@js.native
trait XRPose extends js.Object:
	val emulatedPosition: Boolean = js.native
	val transform: XRRigidTransform = js.native

@js.native
trait XRWebGLLayerInit extends js.Object:
	var antialias: js.UndefOr[Boolean] = js.native
	var depth: js.UndefOr[Boolean] = js.native
	var stencil: js.UndefOr[Boolean] = js.native
	var alpha: js.UndefOr[Boolean] = js.native
	var ignoreDepthValues: js.UndefOr[Boolean] = js.native
	var framebufferScaleFactor: js.UndefOr[Double] = js.native

@js.native
@JSImport("three","XRWebGLLayer")
class XRWebGLLayer extends js.Object:
	def this(session: XRSession, gl: js.UndefOr[WebGLRenderingContext], options: js.UndefOr[XRWebGLLayerInit] = js.undefined) = this()
	var framebuffer: WebGLFramebuffer = js.native
	var framebufferWidth: Double = js.native
	var framebufferHeight: Double = js.native
	def getViewport(view: XRView): XRViewport = js.native

@js.native
trait DOMPointInit extends js.Object:
	var w: js.UndefOr[Double] = js.native
	var x: js.UndefOr[Double] = js.native
	var y: js.UndefOr[Double] = js.native
	var z: js.UndefOr[Double] = js.native

@js.native
@JSImport("three","XRRigidTransform")
class XRRigidTransform extends js.Object:
	def this(matrix: Float32Array | DOMPointInit, direction: js.UndefOr[DOMPointInit] = js.undefined) = this()
	var position: DOMPointReadOnly = js.native
	var orientation: DOMPointReadOnly = js.native
	var matrix: Float32Array = js.native
	var inverse: XRRigidTransform = js.native

@js.native
trait XRView extends js.Object:
	val eye: XREye = js.native
	val projectionMatrix: Float32Array = js.native
	val viewMatrix: Float32Array = js.native
	val transform: XRRigidTransform = js.native

@js.native
trait XRRayDirectionInit extends js.Object:
	var x: js.UndefOr[Double] = js.native
	var y: js.UndefOr[Double] = js.native
	var z: js.UndefOr[Double] = js.native
	var w: js.UndefOr[Double] = js.native

@js.native
@JSImport("three","XRRay")
class XRRay extends js.Object:
	def this(transformOrOrigin: XRRigidTransform | DOMPointInit, direction: js.UndefOr[XRRayDirectionInit] = js.undefined) = this()
	val origin: DOMPointReadOnly = js.native
	val direction: XRRayDirectionInit = js.native
	var matrix: Float32Array = js.native

type XRHitTestTrackableType = "point" | "plane" | "mesh"

@js.native
trait XRHitResult extends js.Object:
	var hitMatrix: Float32Array = js.native

@js.native
trait XRTransientInputHitTestResult extends js.Object:
	val inputSource: XRInputSource = js.native
	val results: js.Array[XRHitTestResult] = js.native

@js.native
trait XRHitTestResult extends js.Object:
	def getPose(baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
	def createAnchor(pose: XRRigidTransform): js.Promise[XRAnchor] = js.native

@js.native
trait XRHitTestSource extends js.Object:
	def cancel(): Unit = js.native

@js.native
trait XRTransientInputHitTestSource extends js.Object:
	def cancel(): Unit = js.native

@js.native
trait XRHitTestOptionsInit extends js.Object:
	var space: EventTarget = js.native
	var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native
	var offsetRay: js.UndefOr[XRRay] = js.native

@js.native
trait XRTransientInputHitTestOptionsInit extends js.Object:
	var profile: String = js.native
	var entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native
	var offsetRay: js.UndefOr[XRRay] = js.native

@js.native
trait XRAnchor extends js.Object:
	var anchorSpace: EventTarget = js.native
	def delete(): Unit = js.native

@js.native
trait XRPlane extends js.Object:
	var orientation: "Horizontal" | "Vertical" = js.native
	var planeSpace: EventTarget = js.native
	var polygon: js.Array[DOMPointReadOnly] = js.native
	var lastChangedTime: Double = js.native

type XRHandJoint = "wrist" | "thumb-metacarpal" | "thumb-phalanx-proximal" | "thumb-phalanx-distal" | "thumb-tip" | "index-finger-metacarpal" | "index-finger-phalanx-proximal" | "index-finger-phalanx-intermediate" | "index-finger-phalanx-distal" | "index-finger-tip" | "middle-finger-metacarpal" | "middle-finger-phalanx-proximal" | "middle-finger-phalanx-intermediate" | "middle-finger-phalanx-distal" | "middle-finger-tip" | "ring-finger-metacarpal" | "ring-finger-phalanx-proximal" | "ring-finger-phalanx-intermediate" | "ring-finger-phalanx-distal" | "ring-finger-tip" | "pinky-finger-metacarpal" | "pinky-finger-phalanx-proximal" | "pinky-finger-phalanx-intermediate" | "pinky-finger-phalanx-distal" | "pinky-finger-tip"

@js.native
trait XRJointSpace extends EventTarget:
	val jointName: XRHandJoint = js.native

@js.native
trait XRJointPose extends XRPose:
	val radius: js.UndefOr[Double] = js.native

@js.native
trait XRHand extends js.Map[XRHandJoint,XRJointSpace]

@js.native
trait Constructor[T] extends js.Object:
	def `new`(args : (js.Any)*): T = js.native
	var prototype: T = js.native

@js.native
trait XRInputSourceChangeEvent extends js.Object:
	var session: XRSession = js.native
	var removed: js.Array[XRInputSource] = js.native
	var added: js.Array[XRInputSource] = js.native

@js.native
trait XRInputSourceEvent extends org.scalajs.dom.Event:
	val frame: XRFrame = js.native
	val inputSource: XRInputSource = js.native

@js.native
trait AnonObject35 extends js.Object:
	var `type`: XRControllerEventType = js.native
	var data: js.UndefOr[XRInputSource] = js.native

@js.native
trait AnonObject37 extends js.Object:
	var detectedPlanes: js.UndefOr[XRPlaneSet] = js.native

@js.native
trait AnonObject36 extends js.Object:
	var planeDetectionState: js.UndefOr[AnonObject38] = js.native
