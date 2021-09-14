package typings.three

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import scalajs.js.typedarray.*

@js.native
JSGlobal("THREE")
object lights extends js.Object:
	@js.native
	class HemisphereLightProbe extends js.Object:
		var isHemisphereLightProbe: true = js.native;
	@js.native
	class DirectionalLight extends js.Object:
		val type: String = js.native;
		val position: Vector3 = js.native;
		val target: Object3D = js.native;
		val intensity: Double = js.native;
		val shadow: DirectionalLightShadow = js.native;
		var isDirectionalLight: true = js.native;
	@js.native
	class PointLightShadow extends js.Object:
		val camera: PerspectiveCamera = js.native;
	@js.native
	class SpotLightShadow extends js.Object:
		val camera: PerspectiveCamera = js.native;
		var isSpotLightShadow: true = js.native;
		val focus: Double = js.native;
	@js.native
	class SpotLight extends js.Object:
		val type: String = js.native;
		val position: Vector3 = js.native;
		val target: Object3D = js.native;
		val intensity: Double = js.native;
		val distance: Double = js.native;
		val angle: Double = js.native;
		val decay: Double = js.native;
		val shadow: SpotLightShadow = js.native;
		val power: Double = js.native;
		val penumbra: Double = js.native;
		var isSpotLight: true = js.native;
	@js.native
	class AmbientLightProbe extends js.Object:
		var isAmbientLightProbe: true = js.native;
	@js.native
	class LightShadow extends js.Object:
		val camera: Camera = js.native;
		val bias: Double = js.native;
		val normalBias: Double = js.native;
		val radius: Double = js.native;
		val mapSize: Vector2 = js.native;
		val map: RenderTarget = js.native;
		val mapPass: RenderTarget = js.native;
		val matrix: Matrix4 = js.native;
		val autoUpdate: Boolean = js.native;
		val needsUpdate: Boolean = js.native;
		def copy(source: LightShadow): this.type = js.native
		def clone(recursive: js.UndefOr[Boolean] = js.undefined): this.type = js.native
		def toJSON(): js.Any = js.native
		def getFrustum(): Double = js.native
		def updateMatrices(light: Light, viewportIndex: js.UndefOr[Double] = js.undefined): Unit = js.native
		def getViewport(viewportIndex: Double): Vector4 = js.native
		def getFrameExtents(): Vector2 = js.native
		def dispose(): Unit = js.native
	@js.native
	class AmbientLight extends js.Object:
		val type: String = js.native;
		var isAmbientLight: true = js.native;
	@js.native
	class DirectionalLightShadow extends js.Object:
		val camera: OrthographicCamera = js.native;
		var isDirectionalLightShadow: true = js.native;
	@js.native
	class HemisphereLight extends js.Object:
		val type: String = js.native;
		val position: Vector3 = js.native;
		val groundColor: Color = js.native;
		var isHemisphereLight: true = js.native;
	@js.native
	class LightProbe extends js.Object:
		val type: String = js.native;
		var isLightProbe: true = js.native;
		val sh: SphericalHarmonics3 = js.native;
		def fromJSON(json: js.Object): LightProbe = js.native
	@js.native
	class PointLight extends js.Object:
		val type: String = js.native;
		val intensity: Double = js.native;
		val distance: Double = js.native;
		val decay: Double = js.native;
		val shadow: PointLightShadow = js.native;
		val power: Double = js.native;
	@js.native
	class Light extends js.Object:
		val type: String = js.native;
		val color: Color = js.native;
		val intensity: Double = js.native;
		var isLight: true = js.native;
		val shadow: LightShadow = js.native;
		val shadowCameraFov: js.Any = js.native;
		val shadowCameraLeft: js.Any = js.native;
		val shadowCameraRight: js.Any = js.native;
		val shadowCameraTop: js.Any = js.native;
		val shadowCameraBottom: js.Any = js.native;
		val shadowCameraNear: js.Any = js.native;
		val shadowCameraFar: js.Any = js.native;
		val shadowBias: js.Any = js.native;
		val shadowMapWidth: js.Any = js.native;
		val shadowMapHeight: js.Any = js.native;
		def dispose(): Unit = js.native
	@js.native
	class RectAreaLight extends js.Object:
		val type: String = js.native;
		val width: Double = js.native;
		val height: Double = js.native;
		val intensity: Double = js.native;
		var isRectAreaLight: true = js.native;
