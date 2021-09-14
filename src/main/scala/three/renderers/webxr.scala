package typings.three.three.renderers.webxr

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
import typings.three.three.renderers.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*

type XRControllerEventType = XREventType | "disconnected" | "connected"

@js.native
@JSGlobal("THREE.WebXRController")
class WebXRController extends js.Object:
  def getTargetRaySpace(): Group = js.native
  def getGripSpace(): Group = js.native
  def dispatchEvent(event: objectType37): this.type = js.native
  def disconnect(inputSource: XRInputSource): this.type = js.native
  def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type =
    js.native

@js.native
@JSGlobal("THREE.WebXRManager")
class WebXRManager extends EventDispatcher:
  def this(renderer: js.Any, gl: WebGLRenderingContext) = this()
  val enabled: Boolean = js.native;
  val isPresenting: Boolean = js.native;
  def getController(index: Double): Group = js.native
  def getControllerGrip(index: Double): Group = js.native
  def getHand(index: Double): Group = js.native
  def setFramebufferScaleFactor(value: Double): Unit = js.native
  def setReferenceSpaceType(value: XRReferenceSpaceType): Unit = js.native
  def getReferenceSpace(): XRReferenceSpace | Null = js.native
  def getSession(): XRSession | Null = js.native
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

type XREventType = "end" | "select" | "selectstart" | "selectend" | "squeeze" | "squeezestart" |
  "squeezeend" | "inputsourceschange"

type XRAnimationLoopCallback = js.Function2[Double, XRFrame, Unit]

type XRFrameRequestCallback = js.Function2[Double, XRFrame, Unit]

@js.native
sealed trait XR extends EventTarget:
  def requestSession(mode: XRSessionMode, options: js.UndefOr[XRSessionInit]): js.Promise[XRSession] =
    js.native
  def isSessionSupported(mode: XRSessionMode): js.Promise[Boolean] = js.native

@js.native
sealed trait Window extends js.Object:
  val XRSession: js.UndefOr[Constructor[XRSession]] = js.native;
  val XR: js.UndefOr[Constructor[XR]] = js.native;

@js.native
sealed trait Navigator extends js.Object:
  val xr: js.UndefOr[XR] = js.native;

@js.native
sealed trait XRViewport extends js.Object:
  var x: Double = js.native;
  var y: Double = js.native;
  var width: Double = js.native;
  var height: Double = js.native;

@js.native
sealed trait WebGLRenderingContext extends js.Object:
  def makeXRCompatible(): js.Promise[Unit] = js.native

@js.native
sealed trait XRRenderState extends js.Object:
  var depthNear: Double = js.native;
  var depthFar: Double = js.native;
  var inlineVerticalFieldOfView: js.UndefOr[Double] = js.native;
  var baseLayer: js.UndefOr[XRWebGLLayer] = js.native;

@js.native
sealed trait XRRenderStateInit extends js.Object:
  val depthNear: js.UndefOr[Double] = js.native;
  val depthFar: js.UndefOr[Double] = js.native;
  val inlineVerticalFieldOfView: js.UndefOr[Double] = js.native;
  val baseLayer: js.UndefOr[XRWebGLLayer] = js.native;

@js.native
sealed trait XRGamepad extends js.Object:
  var id: String = js.native;
  var index: Double = js.native;
  var connected: Boolean = js.native;
  var timestamp: DOMHighResTimeStamp = js.native;
  var mapping: GamepadMappingType = js.native;
  var axes: Float32Array = js.native;
  var buttons: js.Array[GamepadButton] = js.native;

@js.native
sealed trait XRInputSource extends js.Object:
  var handedness: XRHandedness = js.native;
  var targetRayMode: XRTargetRayMode = js.native;
  var targetRaySpace: EventTarget = js.native;
  var gripSpace: js.UndefOr[EventTarget] = js.native;
  var profiles: js.Array[String] = js.native;
  var gamepad: XRGamepad = js.native;
  var hand: js.UndefOr[XRHand] = js.native;

@js.native
sealed trait XRSessionInit extends js.Object:
  val optionalFeatures: js.UndefOr[js.Array[String]] = js.native;
  val requiredFeatures: js.UndefOr[js.Array[String]] = js.native;

@js.native
sealed trait XRSession extends EventTarget:
  def requestReferenceSpace(`type`: XRReferenceSpaceType): js.Promise[XRReferenceSpace] = js.native
  def updateRenderState(renderStateInit: XRRenderStateInit): js.Promise[Unit] = js.native
  def requestAnimationFrame(callback: XRFrameRequestCallback): Double = js.native
  def cancelAnimationFrame(id: Double): Unit = js.native
  def end(): js.Promise[Unit] = js.native
  val renderState: XRRenderState = js.native;
  val inputSources: js.Array[XRInputSource] = js.native;
  val environmentBlendMode: XREnvironmentBlendMode = js.native;
  val visibilityState: XRVisibilityState = js.native;
  def requestHitTestSource(options: XRHitTestOptionsInit): js.Promise[XRHitTestSource] = js.native
  def requestHitTestSourceForTransientInput(
      options: XRTransientInputHitTestOptionsInit
  ): js.Promise[XRTransientInputHitTestSource] = js.native
  def requestHitTest(ray: XRRay, referenceSpace: XRReferenceSpace): js.Promise[js.Array[XRHitResult]] =
    js.native
  def updateWorldTrackingState(options: objectType38): Unit = js.native

@js.native
sealed trait XRReferenceSpace extends EventTarget:
  def getOffsetReferenceSpace(originOffset: XRRigidTransform): XRReferenceSpace = js.native
  val onreset: js.Any = js.native;

type XRPlaneSet = Set[XRPlane]

type XRAnchorSet = Set[XRAnchor]

@js.native
sealed trait XRFrame extends js.Object:
  var session: XRSession = js.native;
  def getViewerPose(referenceSpace: XRReferenceSpace): js.UndefOr[XRViewerPose] = js.native
  def getPose(space: EventTarget, baseSpace: EventTarget): js.UndefOr[XRPose] = js.native
  def getHitTestResults(hitTestSource: XRHitTestSource): js.Array[XRHitTestResult] = js.native
  def getHitTestResultsForTransientInput(
      hitTestSource: XRTransientInputHitTestSource
  ): js.Array[XRTransientInputHitTestResult] = js.native
  val trackedAnchors: js.UndefOr[XRAnchorSet] = js.native;
  def createAnchor(pose: XRRigidTransform, space: EventTarget): js.Promise[XRAnchor] = js.native
  val worldInformation: objectType39 = js.native;
  def getJointPose(joint: XRJointSpace, baseSpace: EventTarget): XRJointPose = js.native

@js.native
sealed trait XRViewerPose extends js.Object:
  var transform: XRRigidTransform = js.native;
  var views: js.Array[XRView] = js.native;

@js.native
sealed trait XRPose extends js.Object:
  var emulatedPosition: Boolean = js.native;
  var transform: XRRigidTransform = js.native;

@js.native
sealed trait XRWebGLLayerInit extends js.Object:
  val antialias: js.UndefOr[Boolean] = js.native;
  val depth: js.UndefOr[Boolean] = js.native;
  val stencil: js.UndefOr[Boolean] = js.native;
  val alpha: js.UndefOr[Boolean] = js.native;
  val ignoreDepthValues: js.UndefOr[Boolean] = js.native;
  val framebufferScaleFactor: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.XRWebGLLayer")
class XRWebGLLayer extends js.Object:
  def this(
      session: XRSession,
      gl: js.UndefOr[WebGLRenderingContext],
      options: js.UndefOr[XRWebGLLayerInit]
  ) = this()
  val framebuffer: WebGLFramebuffer = js.native;
  val framebufferWidth: Double = js.native;
  val framebufferHeight: Double = js.native;
  def getViewport(view: XRView): XRViewport = js.native

@js.native
sealed trait DOMPointInit extends js.Object:
  val w: js.UndefOr[Double] = js.native;
  val x: js.UndefOr[Double] = js.native;
  val y: js.UndefOr[Double] = js.native;
  val z: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.XRRigidTransform")
class XRRigidTransform extends js.Object:
  def this(matrix: Float32Array | DOMPointInit, direction: js.UndefOr[DOMPointInit]) = this()
  val position: DOMPointReadOnly = js.native;
  val orientation: DOMPointReadOnly = js.native;
  val matrix: Float32Array = js.native;
  val inverse: XRRigidTransform = js.native;

@js.native
sealed trait XRView extends js.Object:
  var eye: XREye = js.native;
  var projectionMatrix: Float32Array = js.native;
  var viewMatrix: Float32Array = js.native;
  var transform: XRRigidTransform = js.native;

@js.native
sealed trait XRRayDirectionInit extends js.Object:
  val x: js.UndefOr[Double] = js.native;
  val y: js.UndefOr[Double] = js.native;
  val z: js.UndefOr[Double] = js.native;
  val w: js.UndefOr[Double] = js.native;

@js.native
@JSGlobal("THREE.XRRay")
class XRRay extends js.Object:
  def this(
      transformOrOrigin: XRRigidTransform | DOMPointInit,
      direction: js.UndefOr[XRRayDirectionInit]
  ) = this()
  var origin: DOMPointReadOnly = js.native;
  var direction: XRRayDirectionInit = js.native;
  val matrix: Float32Array = js.native;

type XRHitTestTrackableType = "point" | "plane" | "mesh"

@js.native
sealed trait XRHitResult extends js.Object:
  val hitMatrix: Float32Array = js.native;

@js.native
sealed trait XRTransientInputHitTestResult extends js.Object:
  var inputSource: XRInputSource = js.native;
  var results: js.Array[XRHitTestResult] = js.native;

@js.native
sealed trait XRHitTestResult extends js.Object:
  def getPose(baseSpace: EventTarget): js.UndefOr[XRPose | Null] = js.native
  def createAnchor(pose: XRRigidTransform): js.Promise[XRAnchor] = js.native

@js.native
sealed trait XRHitTestSource extends js.Object:
  def cancel(): Unit = js.native

@js.native
sealed trait XRTransientInputHitTestSource extends js.Object:
  def cancel(): Unit = js.native

@js.native
sealed trait XRHitTestOptionsInit extends js.Object:
  val space: EventTarget = js.native;
  val entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native;
  val offsetRay: js.UndefOr[XRRay] = js.native;

@js.native
sealed trait XRTransientInputHitTestOptionsInit extends js.Object:
  val profile: String = js.native;
  val entityTypes: js.UndefOr[js.Array[XRHitTestTrackableType]] = js.native;
  val offsetRay: js.UndefOr[XRRay] = js.native;

@js.native
sealed trait XRAnchor extends js.Object:
  val anchorSpace: EventTarget = js.native;
  def delete(): Unit = js.native

@js.native
sealed trait XRPlane extends js.Object:
  val orientation: "Horizontal" | "Vertical" = js.native;
  val planeSpace: EventTarget = js.native;
  val polygon: js.Array[DOMPointReadOnly] = js.native;
  val lastChangedTime: Double = js.native;

type XRHandJoint = "wrist" | "thumb-metacarpal" | "thumb-phalanx-proximal" | "thumb-phalanx-distal" |
  "thumb-tip" | "index-finger-metacarpal" | "index-finger-phalanx-proximal" |
  "index-finger-phalanx-intermediate" | "index-finger-phalanx-distal" | "index-finger-tip" |
  "middle-finger-metacarpal" | "middle-finger-phalanx-proximal" | "middle-finger-phalanx-intermediate" |
  "middle-finger-phalanx-distal" | "middle-finger-tip" | "ring-finger-metacarpal" |
  "ring-finger-phalanx-proximal" | "ring-finger-phalanx-intermediate" | "ring-finger-phalanx-distal" |
  "ring-finger-tip" | "pinky-finger-metacarpal" | "pinky-finger-phalanx-proximal" |
  "pinky-finger-phalanx-intermediate" | "pinky-finger-phalanx-distal" | "pinky-finger-tip"

@js.native
sealed trait XRJointSpace extends EventTarget:
  var jointName: XRHandJoint = js.native;

@js.native
sealed trait XRJointPose extends XRPose:
  var radius: js.UndefOr[Double] = js.native;

@js.native
sealed trait XRHand extends js.Map[XRHandJoint, XRJointSpace]:
  var size: Double = js.native;

@js.native
sealed trait Constructor[T] extends js.Object:
  def `new`(args: (js.Array[js.Any])*): T = js.native
  val prototype: T = js.native;

@js.native
sealed trait XRInputSourceChangeEvent extends js.Object:
  val session: XRSession = js.native;
  val removed: js.Array[XRInputSource] = js.native;
  val added: js.Array[XRInputSource] = js.native;

@js.native
sealed trait XRInputSourceEvent extends org.scalajs.dom.Event:
  var frame: XRFrame = js.native;
  var inputSource: XRInputSource = js.native;

@js.native
sealed trait objectType37 extends js.Object:
  val `type`: XRControllerEventType = js.native;
  val data: js.UndefOr[XRInputSource] = js.native;

@js.native
sealed trait objectType39 extends js.Object:
  val detectedPlanes: js.UndefOr[XRPlaneSet] = js.native;

@js.native
sealed trait objectType38 extends js.Object:
  val planeDetectionState: js.UndefOr[objectType40] = js.native;
