package typings.three.three.animation

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

@js.native
@JSGlobal("THREE.AnimationAction")
class AnimationAction extends js.Object:
  def this(
      mixer: AnimationMixer,
      clip: AnimationClip,
      localRoot: js.UndefOr[Object3D],
      blendMode: js.UndefOr[AnimationBlendMode]
  ) = this()
  val blendMode: AnimationBlendMode = js.native;
  val loop: AnimationActionLoopStyles = js.native;
  val time: Double = js.native;
  val timeScale: Double = js.native;
  val weight: Double = js.native;
  val repetitions: Double = js.native;
  val paused: Boolean = js.native;
  val enabled: Boolean = js.native;
  val clampWhenFinished: Boolean = js.native;
  val zeroSlopeAtStart: Boolean = js.native;
  val zeroSlopeAtEnd: Boolean = js.native;
  def play(): AnimationAction = js.native
  def stop(): AnimationAction = js.native
  def reset(): AnimationAction = js.native
  def isRunning(): Boolean = js.native
  def isScheduled(): Boolean = js.native
  def startAt(time: Double): AnimationAction = js.native
  def setLoop(mode: AnimationActionLoopStyles, repetitions: Double): AnimationAction = js.native
  def setEffectiveWeight(weight: Double): AnimationAction = js.native
  def getEffectiveWeight(): Double = js.native
  def fadeIn(duration: Double): AnimationAction = js.native
  def fadeOut(duration: Double): AnimationAction = js.native
  def crossFadeFrom(fadeOutAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction =
    js.native
  def crossFadeTo(fadeInAction: AnimationAction, duration: Double, warp: Boolean): AnimationAction =
    js.native
  def stopFading(): AnimationAction = js.native
  def setEffectiveTimeScale(timeScale: Double): AnimationAction = js.native
  def getEffectiveTimeScale(): Double = js.native
  def setDuration(duration: Double): AnimationAction = js.native
  def syncWith(action: AnimationAction): AnimationAction = js.native
  def halt(duration: Double): AnimationAction = js.native
  def warp(statTimeScale: Double, endTimeScale: Double, duration: Double): AnimationAction = js.native
  def stopWarping(): AnimationAction = js.native
  def getMixer(): AnimationMixer = js.native
  def getClip(): AnimationClip = js.native
  def getRoot(): Object3D = js.native

@js.native
@JSGlobal("THREE.KeyframeTrack")
class KeyframeTrack extends js.Object:
  def this(
      name: String,
      times: ArrayLike[js.Any],
      values: ArrayLike[js.Any],
      interpolation: js.UndefOr[InterpolationModes]
  ) = this()
  val name: String = js.native;
  val times: Float32Array = js.native;
  val values: Float32Array = js.native;
  val ValueTypeName: String = js.native;
  val TimeBufferType: Float32Array = js.native;
  val ValueBufferType: Float32Array = js.native;
  val DefaultInterpolation: InterpolationModes = js.native;
  def InterpolantFactoryMethodDiscrete(result: js.Any): DiscreteInterpolant = js.native
  def InterpolantFactoryMethodLinear(result: js.Any): LinearInterpolant = js.native
  def InterpolantFactoryMethodSmooth(result: js.Any): CubicInterpolant = js.native
  def setInterpolation(interpolation: InterpolationModes): KeyframeTrack = js.native
  def getInterpolation(): InterpolationModes = js.native
  def getValueSize(): Double = js.native
  def shift(timeOffset: Double): KeyframeTrack = js.native
  def scale(timeScale: Double): KeyframeTrack = js.native
  def trim(startTime: Double, endTime: Double): KeyframeTrack = js.native
  def validate(): Boolean = js.native
  def optimize(): KeyframeTrack = js.native
  def clone(): this.type = js.native

object KeyframeTrack:
  def toJSON(track: KeyframeTrack): js.Any = js.native

@js.native
sealed trait ParseTrackNameResults extends js.Object:
  val nodeName: String = js.native;
  val objectName: String = js.native;
  val objectIndex: String = js.native;
  val propertyName: String = js.native;
  val propertyIndex: String = js.native;

@js.native
@JSGlobal("THREE.PropertyBinding")
class PropertyBinding extends js.Object:
  def this(rootNode: js.Any, path: String, parsedPath: js.UndefOr[js.Any]) = this()
  val path: String = js.native;
  val parsedPath: js.Any = js.native;
  val node: js.Any = js.native;
  val rootNode: js.Any = js.native;
  val BindingType: objectType7 = js.native;
  val Versioning: objectType8 = js.native;
  val GetterByBindingType: Array[js.Function0[Unit]] = js.native;
  val SetterByBindingTypeAndVersioning: Array[Array[js.Function0[Unit]]] = js.native;
  def getValue(targetArray: js.Any, offset: Double): js.Any = js.native
  def setValue(sourceArray: js.Any, offset: Double): Unit = js.native
  def bind(): Unit = js.native
  def unbind(): Unit = js.native

@js.native
@JSGlobal("THREE.PropertyBinding")
object PropertyBinding extends js.Object:

  @js.native
  // @JSGlobal("")
  class Composite extends js.Object:
    def this(targetGroup: js.Any, path: js.Any, parsedPath: js.UndefOr[js.Any]) = this()
    def getValue(array: js.Any, offset: Double): js.Any = js.native
    def setValue(array: js.Any, offset: Double): Unit = js.native
    def bind(): Unit = js.native
    def unbind(): Unit = js.native

// object PropertyBinding:
  def create(
      root: js.Any,
      path: js.Any,
      parsedPath: js.UndefOr[js.Any]
  ): PropertyBinding | PropertyBinding.Composite = js.native
  def sanitizeNodeName(name: String): String = js.native
  def parseTrackName(trackName: String): ParseTrackNameResults = js.native
  def findNode(root: js.Any, nodeName: String): js.Any = js.native

@js.native
@JSGlobal("THREE.AnimationUtils")
object AnimationUtils extends js.Object:
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any = js.native
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any = js.native
  def isTypedArray(`object`: js.Any): Boolean = js.native
  def getKeyFrameOrder(times: js.Array[Double]): js.Array[Double] = js.native
  def sortedArray(values: js.Array[js.Any], stride: Double, order: js.Array[Double]): js.Array[js.Any] =
    js.native
  def flattenJSON(
      jsonKeys: js.Array[String],
      times: js.Array[js.Any],
      values: js.Array[js.Any],
      valuePropertyName: String
  ): Unit = js.native
  def subclip(
      sourceClip: AnimationClip,
      name: String,
      startFrame: Double,
      endFrame: Double,
      fps: js.UndefOr[Double]
  ): AnimationClip = js.native
  def makeClipAdditive(
      targetClip: AnimationClip,
      referenceFrame: js.UndefOr[Double],
      referenceClip: js.UndefOr[AnimationClip],
      fps: js.UndefOr[Double]
  ): AnimationClip = js.native

@js.native
@JSGlobal("THREE.AnimationObjectGroup")
class AnimationObjectGroup extends js.Object:
  def this(args: (js.Array[js.Any])*) = this()
  val uuid: String = js.native;
  val stats: objectType9 = js.native;
  var isAnimationObjectGroup: Boolean = js.native;
  def add(args: (js.Array[js.Any])*): Unit = js.native
  def remove(args: (js.Array[js.Any])*): Unit = js.native
  def uncache(args: (js.Array[js.Any])*): Unit = js.native

@js.native
@JSGlobal("THREE.PropertyMixer")
class PropertyMixer extends js.Object:
  def this(binding: js.Any, typeName: String, valueSize: Double) = this()
  val binding: js.Any = js.native;
  val valueSize: Double = js.native;
  val buffer: js.Any = js.native;
  val cumulativeWeight: Double = js.native;
  val cumulativeWeightAdditive: Double = js.native;
  val useCount: Double = js.native;
  val referenceCount: Double = js.native;
  def accumulate(accuIndex: Double, weight: Double): Unit = js.native
  def accumulateAdditive(weight: Double): Unit = js.native
  def apply(accuIndex: Double): Unit = js.native
  def saveOriginalState(): Unit = js.native
  def restoreOriginalState(): Unit = js.native

@js.native
sealed trait MorphTarget extends js.Object:
  val name: String = js.native;
  val vertices: js.Array[Vector3] = js.native;

@js.native
@JSGlobal("THREE.AnimationClip")
class AnimationClip extends js.Object:
  def this(
      name: js.UndefOr[String],
      duration: js.UndefOr[Double],
      tracks: js.UndefOr[js.Array[KeyframeTrack]],
      blendMode: js.UndefOr[AnimationBlendMode]
  ) = this()
  val name: String = js.native;
  val tracks: js.Array[KeyframeTrack] = js.native;
  val blendMode: AnimationBlendMode = js.native;
  val duration: Double = js.native;
  val uuid: String = js.native;
  val results: js.Array[js.Any] = js.native;
  def resetDuration(): AnimationClip = js.native
  def trim(): AnimationClip = js.native
  def validate(): Boolean = js.native
  def optimize(): AnimationClip = js.native
  def clone(): this.type = js.native
  def toJSON(clip: AnimationClip): js.Any = js.native

object AnimationClip:
  def CreateFromMorphTargetSequence(
      name: String,
      morphTargetSequence: js.Array[MorphTarget],
      fps: Double,
      noLoop: Boolean
  ): AnimationClip = js.native
  def findByName(clipArray: js.Array[AnimationClip], name: String): AnimationClip = js.native
  def CreateClipsFromMorphTargetSequences(
      morphTargets: js.Array[MorphTarget],
      fps: Double,
      noLoop: Boolean
  ): js.Array[AnimationClip] = js.native
  def parse(json: js.Any): AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[Bone]): AnimationClip = js.native
  def toJSON(clip: AnimationClip): js.Any = js.native

@js.native
@JSGlobal("THREE.AnimationMixer")
class AnimationMixer extends EventDispatcher:
  def this(root: Object3D | AnimationObjectGroup) = this()
  val time: Double = js.native;
  val timeScale: Double = js.native;
  def clipAction(
      clip: AnimationClip,
      root: js.UndefOr[Object3D | AnimationObjectGroup],
      blendMode: js.UndefOr[AnimationBlendMode]
  ): AnimationAction = js.native
  def existingAction(
      clip: AnimationClip,
      root: js.UndefOr[Object3D | AnimationObjectGroup]
  ): AnimationAction | Null = js.native
  def stopAllAction(): AnimationMixer = js.native
  def update(deltaTime: Double): AnimationMixer = js.native
  def setTime(timeInSeconds: Double): AnimationMixer = js.native
  def getRoot(): Object3D | AnimationObjectGroup = js.native
  def uncacheClip(clip: AnimationClip): Unit = js.native
  def uncacheRoot(root: Object3D | AnimationObjectGroup): Unit = js.native
  def uncacheAction(clip: AnimationClip, root: js.UndefOr[Object3D | AnimationObjectGroup]): Unit =
    js.native

@js.native
sealed trait objectType7 extends js.Object:
  @JSBracketAccess
  def apply(bindingType: String): Double = js.native

@js.native
sealed trait objectType8 extends js.Object:
  @JSBracketAccess
  def apply(versioning: String): Double = js.native

@js.native
sealed trait objectType9 extends js.Object:
  val bindingsPerObject: Double = js.native;
  val objects: objectType10 = js.native;
