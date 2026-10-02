// entry=0x9fd14

void H956c0(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  int iVar5;
  long unaff_x26;
  
  iVar5 = (int)DAT_0027fb18;
  uVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((-iVar5 ^ 0x56e407c0U) + (-iVar5 & 0x56e407c0U) * 2) * 300 +
                     (long)(int)((iVar5 * -2 | 0xadc811aaU) - (-iVar5 ^ 0x56e408d5U))])
                    ((-DAT_0027fb18 ^ 0x2e00d84656e40828U) +
                     (-DAT_0027fb18 & 0x2e00d84656e40828U) * 2);
  puVar4 = (undefined8 *)FUN_0026eefc(&DAT_00286190);
  *puVar4 = uVar3;
  CallSupervisor(0);
  iVar5 = (int)DAT_0027fb18;
  uVar2 = (int)*(undefined8 *)(unaff_x26 + 8) * (-0x6755a9d4 - (-iVar5 ^ 0xffffffffU));
  uVar1 = (-iVar5 | 0x56e437f9U) + (-iVar5 & 0x56e437f9U);
                    /* WARNING: Could not recover jumptable at 0x00195844. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_00279e00)
            [(long)(int)((-iVar5 | 0x56e407c0U) * 2 - (-iVar5 ^ 0x56e407c0U)) * 0x55])
            ((uVar2 ^ uVar1) + (uVar2 & uVar1) * 2,
             (-DAT_0027fb18 | 0x2e00d84656e407c0U) + (-DAT_0027fb18 & 0x2e00d84656e407c0U));
  return;
}


