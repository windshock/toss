// entry=0xea884

void He8e48(undefined8 param_1,byte *param_2,undefined8 param_3,undefined8 param_4,
           undefined4 param_5,undefined8 param_6,long param_7,ulong param_8)

{
  undefined **ppuVar1;
  bool bVar2;
  bool bVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 in_x12;
  ulong in_x17;
  long unaff_x19;
  
  uVar4 = (param_7 << 3 ^
          0xebd8be6e7b9ee795 - (-DAT_002765f0 ^ 0xffffffffffffffffU) ^ 0xffffffffffffffff) &
          param_7 << 3;
  uVar5 = (param_8 | 1) * 2 - (param_8 ^ 1);
  bVar3 = ((uVar4 | *param_2) & (*param_2 & uVar4 ^ 0xffffffffffffffff)) != 0x258c7ff0bdabbd;
  bVar2 = uVar5 < (-DAT_002765f0 | 0xeb98be6e7b9ee7b0U) + (-DAT_002765f0 & 0xeb98be6e7b9ee7b0U);
  if ((!bVar2 || !bVar3) && bVar2 == bVar3) {
    *(undefined4 *)(unaff_x19 + 0x2c) = param_5;
    *(undefined8 *)(unaff_x19 + 0x40) = param_1;
    *(undefined8 *)(unaff_x19 + 0x68) = in_x12;
                    /* WARNING: Could not recover jumptable at 0x001eaf30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00275578)();
    return;
  }
  ppuVar1 = &PTR_thunk_FUN_001eb4f4_0027dbf0;
  if (uVar5 != in_x17) {
    ppuVar1 = &PTR_LAB_00274388;
  }
                    /* WARNING: Could not recover jumptable at 0x001eccd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


